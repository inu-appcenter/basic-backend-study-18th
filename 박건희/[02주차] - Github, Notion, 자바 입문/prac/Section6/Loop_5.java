package Section6;
// 중첩 반복문
public class Loop_5 {
    static void main() {

        //for문 중첩
        for (int i = 0; i < 2; i++) {
            System.out.println("외부 for 시작 i:" + i);

            for (int j = 0; j < 3; j++) {
                System.out.println("-> 내부 for " + i + "-" + j);
            }

            System.out.println("외부 for 종료 i:" + i);
            System.out.println(); //라인 구분을 위해 실행
        }

        //while로 표현
        int i = 0, j = 0;
        while( i <= 2 ){
            i++;
            System.out.println("외부 for 시작 i:" + i);

            while( j <= 3 ){
                j++;
                System.out.println("-> 내부 for " + i + "-" + j);
            }

            System.out.println("외부 for 종료 i:" + i);
            System.out.println(); //라인 구분을 위해 실행
        }



    }
}
