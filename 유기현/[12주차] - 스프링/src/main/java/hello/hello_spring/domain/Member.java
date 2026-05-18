package hello.hello_spring.domain;

import jakarta.persistence.*;

@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //db가 알아서 생성해 주는거 IDENTITY
    private Long id;

    //@Column(name = "username"); 이런식으러 정할 수도 있다.
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
