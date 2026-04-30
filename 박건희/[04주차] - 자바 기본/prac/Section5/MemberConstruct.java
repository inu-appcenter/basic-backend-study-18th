package Section5;

public class MemberConstruct {

    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        this(name, age, 50); // 다른 생성자의 호출을 통해서 생성자 선언 가능.
    }

    MemberConstruct(String name, int age, int grade) {

        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);

        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}
