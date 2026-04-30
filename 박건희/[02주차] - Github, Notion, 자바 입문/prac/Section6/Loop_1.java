package Section6;
// while 반복문1
public class Loop_1 {
    static void main() {

        int count = 0;

        // 단순 3회 반복
        count = count + 1;
        System.out.println("현재 숫자는:" + count);

        count = count + 1;
        System.out.println("현재 숫자는:" + count);

        count = count + 1;
        System.out.println("현재 숫자는:" + count);

        // 개선된 3회 반복
        count = 0; // 초기화

        count++;
        System.out.println("현재 숫자는:" + count);
        count++;
        System.out.println("현재 숫자는:" + count);
        count++;
        System.out.println("현재 숫자는:" + count);

        // while 반복문을 이용하여 코드 반복(3회)
        count = 0; // 초기화

        while (count < 3) {
            count++;
            System.out.println("현재 숫자는:" + count);
        }

        //
        int sum = 0;
        int i = 100;

        sum = sum + 1;
        System.out.println("i=" + i + " sum=" + sum);
        i++;
        sum = sum + 2;
        System.out.println("i=" + i + " sum=" + sum);
        i++;
        sum = sum + 3;
        System.out.println("i=" + i + " sum=" + sum);

    }
}
