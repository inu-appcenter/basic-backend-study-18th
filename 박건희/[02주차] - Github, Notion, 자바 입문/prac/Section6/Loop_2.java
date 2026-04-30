package Section6;
// while 반복문2
public class Loop_2 {
    static void main() {

        int sum = 0;
        int i = 1;
        int endNum = 3;

        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);
        i++;
        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);
        i++;
        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);
        i++;

        //위 코드를 while 문으로 표현
        i = 10;
        endNum = 20;
        while (i <= endNum) {
            sum += i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }

    }
}
