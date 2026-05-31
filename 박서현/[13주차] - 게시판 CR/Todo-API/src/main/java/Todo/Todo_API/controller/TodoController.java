package Todo.Todo_API.controller;

import Todo.Todo_API.domain.Todo;
import Todo.Todo_API.dto.TodoCreateRequest;
import Todo.Todo_API.dto.TodoResponse;
import Todo.Todo_API.dto.TodoUpdateRequest;
import Todo.Todo_API.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/*
6. **REST API 4개 이상 구현**
    - `POST /books` — 등록 (완료)
    - `GET /books` — 전체 목록 조회 (완료)
    - `poGET /books/{id}` — 단건 조회 (완료)
    - `PATCH /books/{id}` — 수정 (완료)
    - `DELETE /books/{id}` — 삭제 (완료)
    - HTTP 메서드, URI, 상태 코드를 10주차 HTTP 강의 내용에 맞춰서 설계
 */
@RestController
@RequestMapping("/todos")
public class TodoController {

    //서비스랑 연결하기
    private final TodoService todoService;
    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    //전체 조회 컨트롤러
    @GetMapping //클라이언트가 GET으로 요청을 보냈을 때 받음
    public ResponseEntity<List<TodoResponse>> list(){
        List<TodoResponse> todos = todoService.findTodos();
        return ResponseEntity.ok(todos);
    }

    @PostMapping
    public ResponseEntity<TodoResponse> create(@RequestBody TodoCreateRequest todoC){
        TodoResponse todoResponse = todoService.save(todoC);
        return ResponseEntity
                .status(HttpStatus.CREATED)  //201을 반환하기 위함
                .body(todoResponse);
    }

    //id로 검색하기
    @GetMapping("/{id}")
    public ResponseEntity<TodoResponse> getTodoById(@PathVariable Long id){
        TodoResponse response = todoService.findById(id);
        return ResponseEntity.ok(response);
    }

    //제목으로 검색하기
    @GetMapping("/title/{title}") //그냥 title해버리면 id랑 구분을 못해버림
    public ResponseEntity<TodoResponse> getTodoByTitle(@PathVariable String title){
        TodoResponse response = todoService.findByTitle(title);
        return ResponseEntity.ok(response);
    }

    //삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        todoService.delete(id);
        return ResponseEntity.ok("삭제 성공!");
    }

    //수정
    @PatchMapping("/{id}")
    public ResponseEntity<TodoResponse> update(@PathVariable Long id,
                                               @RequestBody TodoUpdateRequest requestDto)
    {
        TodoResponse todoResponse = todoService.update(id, requestDto);
        return ResponseEntity.ok(todoResponse);
    }




}
