package 미션절망편;

class 미션 {
    int 정답=2026;
}

public class 미션2_예시코드 {
    public static void main(String[] args) {
        미션 미션1 = new 미션();

        미션제출하기(미션1, 10);
        정답보기(미션1);

    }
    static void 미션제출하기(미션 미션,int 입력){
        if(입력 == 미션.정답)
            System.out.println("정답!");
        else
            System.out.println("땡!");
    }
    static void 정답보기(미션 미션) {
        System.out.println("정답 : " + 미션.정답);
    }
}
