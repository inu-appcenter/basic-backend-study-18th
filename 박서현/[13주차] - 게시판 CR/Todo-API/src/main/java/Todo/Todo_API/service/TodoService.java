package Todo.Todo_API.service;

import Todo.Todo_API.domain.Todo;
import Todo.Todo_API.dto.TodoCreateRequest;
import Todo.Todo_API.dto.TodoResponse;
import Todo.Todo_API.dto.TodoUpdateRequest;
import Todo.Todo_API.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

//등록, 전체목록조회, 단건조회, 수정, 삭제

@RequiredArgsConstructor //꼭 필요한 필드(final, NonNull 등)의 생성자 자동 생성
@Service
public class TodoService {
    private final TodoRepository todoRepository; //레포지토리 고정하기

    //1. 새 todo 등록
    // JPA를 상속받아 만든 리포지토리는 데이터를 저장할때 save사용. 다른거 쓰면 안됨(create같은..)
    public TodoResponse save (TodoCreateRequest createDto){
        Todo todo = todoRepository.save(createDto.toEntity());
        return new TodoResponse(todo);
    }

    //2. 전체목록 조회
    public List<TodoResponse> findTodos() {
        //findAll은 JPA가 만들어준 메서드라 직접 수정 불가. DTO타입으로 우회해서 보내기 위해
        //일단은 Todo 리스트로 받음
        List<Todo> todos = todoRepository.findAll();

        // todos.stream() :리스트를 일렬종대 흐름으로 만듦. 걍 줄세워서 벨트 위에 올리기
        // map: 벨트 타고 지나가는 데이터를 TodoResponse(Todo entity)를 호출해 DTO객체로 변환
        //collect: 벨트 다 지나갔으면 그것들 줍줍해서 다시 List로 만들어줌
        return todos.stream()
                .map(todo -> new TodoResponse(todo))
                .collect(Collectors.toList());

    }
    //3. 단건조회
    //id로 단건 조회
    public TodoResponse findById(Long id){
        Todo entity = todoRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException(id + "에 해당하는 할일목록이 없어요"));
        return new TodoResponse(entity);
    }

    //제목으로 단건 조회
    public TodoResponse findByTitle(String title){
        Todo entity = todoRepository.findByTitle(title)
                .orElseThrow(()-> new IllegalArgumentException(title + "은/는 존재하지 않아요."));
        return new TodoResponse(entity);
    }

    //4. 수정
    public TodoResponse update (Long id, TodoUpdateRequest updateDto) {
        Todo entity = todoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException(id + "에 해당하는 할일목록이 없어요"));

        //트랜잭션 안에서 값 변경하면 자동으로 update 쿼리가 실행됨
        entity.update(updateDto.getTitle(), updateDto.getContent(), updateDto.getIsDone());

        return new TodoResponse(entity);
    }

    //5. 삭제
    public void delete(long id){
        Todo entity = todoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException(id + "에 해당하는 할일목록이 없어요"));

        todoRepository.delete(entity);

    }


}
