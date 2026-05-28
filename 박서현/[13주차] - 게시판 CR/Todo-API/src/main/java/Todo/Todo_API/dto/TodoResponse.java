package Todo.Todo_API.dto;

import Todo.Todo_API.domain.Todo;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

//응답 DTO
@Getter
public class TodoResponse {
    private Long id;
    private String title;
    private String content;
    private Boolean isDone;
    private LocalDateTime createAt;

    public TodoResponse(Todo entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.isDone = entity.getIsDone();
        this.createAt = entity.getCreateAt();
    }

}
