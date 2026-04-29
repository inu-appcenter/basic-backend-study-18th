package final1.ex;

public class MemberMain {

    public static void main(String[] args) {

        Member member = new Member("myID","kim");
        member.print();
        member.changeData("myID2","lee");
        member.print();


    }
}
