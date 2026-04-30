package Section6;
// do-while 반복문
public class Loop_3 {
    static void main() {

        // do while문으로 조건부 반복문을 작성하면 적어도 1번의 무조건부 do종속 코드 실행이 발생함.
        int i = 10;

        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i < 3);

        // continue & break
        int sum = 0;
        int j = 1;

        while (true) {
            sum += j;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: j=" + j + " sum=" + sum);
                break; // 즉시 while문 종료
            }
            i++;
        }

        int k = 1;
        while (k <= 5) {
            if (k == 3) {
                k++;
                continue; // 즉시 반복문의 조건식으로 이동
            }
            System.out.println(k);
            k++;
        }
    }
}
