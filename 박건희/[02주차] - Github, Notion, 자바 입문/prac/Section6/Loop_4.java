package Section6;
// for문 1
public class Loop_4 {
    static void main() {

        // 1씩 증가하는 i 출력, 변수 선언과 초기화를 따로 하지 않아도 실행 O
        // + i는 지역변수/카운터 변수
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 합 구하기
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum; i++) {
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
        }

        // while문으로 표현
        int sum_t = 0;
        int i = 1; // 변수의 선언이 외부에서 이루어짐.
        int endNum_t = 3;

        while (i <= endNum_t) {
            sum_t = sum_t + i;
            System.out.println("i=" + i + " sum=" + sum_t);
            i++;
        }

        // 무한반복문 생성
        // for
        int k = 0;
        for (;;){
            k++;
            if (k == 10000){
                break;
            }
        }
        //while
        k = 0;
        while (true){
            k++;
            if (k == 10000){
                System.out.println(k);
                break;
            }
        }

    }
}
