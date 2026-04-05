package Section9.zip;

public class MemberMain {

    static void main() {

        Member member = new Member("myId", "kim");
        member.print();
        member.changeData("myId2","seo");
        member.print();
    }
}
