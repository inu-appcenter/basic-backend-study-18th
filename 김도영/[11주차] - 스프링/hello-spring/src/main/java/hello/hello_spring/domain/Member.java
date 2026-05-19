package hello.hello_spring.domain;

import jakarta.persistence.*;

// db 생성
@Entity
public class Member {

    // id, pk 설정
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(name="username") 만약 테이블 컬럼이 name이면 이렇게도 가능
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
