package hello.hello_spring.controller;

public class MemberForm {
    private String name; // 스프링이 createMemberForm.html에서 받은 name을 여기로 넘겨줌

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
