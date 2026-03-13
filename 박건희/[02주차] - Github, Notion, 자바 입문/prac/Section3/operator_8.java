package Section3;
//문제 풀이 및 해석
public class operator_8 {
    static void main() {

        // Q1. int 평균
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum / 3; // java에서 int 끼리의 연산에서 소수점을 모두 버림.

        System.out.println(sum);
        System.out.println(average);

        // Q2. double 평균
        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;

        double sum2 = val1 + val2 + val3;
        double avg = sum2 / 3;

        System.out.println(sum);
        System.out.println(avg);

        // Q3.
        int score = 80;
        boolean result = score >= 80 && score <= 100; // 결과가 정해진 boolean값이여서 경고가 생성됨.
        System.out.println(result);

    }
}
