package Todo.Todo_API.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TodoUpdateRequest {
    private String title;
    private String content;
    private Boolean isDone;
}
