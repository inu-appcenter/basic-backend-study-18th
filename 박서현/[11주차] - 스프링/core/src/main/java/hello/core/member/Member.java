package hello.core.member;

public class Member {
    private Long id;
    private String name;
    private Gread grad;

    public Member(Long id, String name, Gread grad) {
        this.id = id;
        this.name = name;
        this.grad = grad;
    }

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

    public Gread getGrad() {
        return grad;
    }

    public void setGrad(Gread grad) {
        this.grad = grad;
    }


}
