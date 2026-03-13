package Section3;
//증감 연산자
public class operator_4 {
    static void main() {

        int a = 0;

        a = a + 1;
        System.out.println("a = " + a); //1

        a = a + 1;
        System.out.println("a = " + a); //2

        // 증감 연산자
        ++a; // a = a + 1
        System.out.println("a = " + a); //3

        ++a;
        System.out.println("a = " + a); //4

        a = 1;
        int b = 0;
        b = ++a; // a의 값을 먼저 증가시키고, 그 결과를 b에 대입

        System.out.println("a = " + a + ", b = " + b);

        // 후위 증감 연산자 사용 예
        a = 1; // a 값을 다시 1로 지정
        b = 0; // b 값을 다시 0으로 지정
        b = a++; // b에 a 값 대입 -> a 값 1 증가
        System.out.println("a = " + a + ", b = " + b);

    }
}
