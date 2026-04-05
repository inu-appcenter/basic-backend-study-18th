public class FinalMain {
    public static void main(String[] args) {
        final Member member = new Member("홍길동", 19);
        // member = new Member("전우치", 20);
        // member.name = "철수";
        member.age = 20;
    }
}
class Member {
    final String name;
    int age;
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
}