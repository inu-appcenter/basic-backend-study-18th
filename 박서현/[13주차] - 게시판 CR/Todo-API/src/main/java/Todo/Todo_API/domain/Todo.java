package Todo.Todo_API.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor // 기본 생성자 자동 추가
@Getter //GETTER 자동 생성
@EntityListeners(AuditingEntityListener.class) //시간 자동 기록
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //DB에서 자동으로 번호를 따옴
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(length = 500) // 메모는 500자까지 가능하게 늘림
    private String content;

    @Column(nullable = false)
    private Boolean isDone= false;//기본값은 false로 지정;

    //생성 시간/날짜를 저장하기 위해 LocalDateTime 사용
    @CreatedDate //자동으로 데이터 만듦
    @Column(updatable = false) // 생성시간 수정 방지
    private LocalDateTime createAt;

    public Todo(String title, String content){
        this.title = title;
        this.content = content;
    }

    //수정 기능을 위한 update
    public void update(String title, String content, Boolean isDone){
        this.title = title;
        this.content = content;
        this.isDone = isDone;
    }//id와 creatAt은 JPA가 자동으로 채워주니 제외


}
