package Todo.Todo_API.dto;

import Todo.Todo_API.domain.Todo;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


//생성 요청 DTO
@Getter
@NoArgsConstructor
public class TodoCreateRequest {
    private String title;
    private String content;


    public TodoCreateRequest(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Todo toEntity(){
        return new Todo(this.title, this.content);
    }

}
