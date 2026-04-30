package Section5;

public class Constructor_2 {

    static void main() {

        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80); // 생성자 사용시 불필요한 유령 데이터의 발생을 없앨 수 있음.
        MemberConstruct menber3 = new MemberConstruct("user3", 34); // 오버 로딩하여 생성자 선언 가능.

        MemberConstruct[] members = {member1, member2, menber3};

        for (MemberConstruct s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

    }
}
