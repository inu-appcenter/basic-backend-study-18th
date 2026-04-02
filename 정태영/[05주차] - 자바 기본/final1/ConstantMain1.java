package final1;

public class ConstantMain1 {
    public static void main(String[] args) {


    }
    private static void process(int currentUserCount){
        System.out.println("참여자 수 : " + currentUserCount);
        if(currentUserCount > 1000)
            System.out.println("대기자로 등록");
        else
            System.out.println("게임 참가");
    }
}
