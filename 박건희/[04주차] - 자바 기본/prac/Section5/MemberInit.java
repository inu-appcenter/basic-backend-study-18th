package Section5;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {

        this.name = name; // this 멤버 변수가 우선순위
        this.age = age;
        this.grade = grade;

    }

}
