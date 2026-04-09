package 미션희망편;

public class 미션 {
    private int 정답;

    미션(){
        정답 = 2026;
    }

    void 미션제출하기(int 입력){
        if(입력 == 정답)
            System.out.println("정답!");
        else
            System.out.println("땡!");
    }
    void 정답보기(){
        System.out.println("정답 : " + 정답);
    }
}
