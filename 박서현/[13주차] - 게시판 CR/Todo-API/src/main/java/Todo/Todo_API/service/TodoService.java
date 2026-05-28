package Todo.Todo_API.service;

import Todo.Todo_API.domain.Todo;
import Todo.Todo_API.dto.TodoCreateRequest;
import Todo.Todo_API.dto.TodoResponse;
import Todo.Todo_API.dto.TodoUpdateRequest;
import Todo.Todo_API.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

//등록, 전체목록조회, 단건조회, 수정, 삭제

@RequiredArgsConstructor //꼭 필요한 필드(final, NonNull 등)의 생성자 자동 생성
@Service
public class TodoService {
    private final TodoRepository todoRepository; //레포지토리 고정하기

    //1. 새 todo 등록
    // JPA를 상속받아 만든 리포지토리는 데이터를 저장할때 save사용. 다른거 쓰면 안됨(create같은..)
    public Long svae (TodoCreateRequest createDto){
        return todoRepository.save(createDto.toEntity()).getId();
    }

    //2. 전체목록 조회
    public List<Todo> findTodos() {
        return todoRepository.findAll();
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
    public Long update (Long id, TodoUpdateRequest updateDto) {
        Todo entity = todoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException(id + "에 해당하는 할일목록이 없어요"));

        //트랜잭션 안에서 값 변경하면 자동으로 update 쿼리가 실행됨
        entity.update(updateDto.getTitle(), updateDto.getContent(), updateDto.getIsDone());

        return id;
    }

    //5. 삭제
    public void delete(long id){
        Todo entity = todoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException(id + "에 해당하는 할일목록이 없어요"));

        todoRepository.delete(entity);

    }


}
