package Section3;
//논리 연산자
public class operator_6 {
    static void main() {

        System.out.println("&&: AND 연산");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("||: OR 연산");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! 연산"); //부정 논리 <!결과>가 ture이면 false, false면 ture 반환
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");

        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);

        //예제

        int c = 15;
        //a는 10보다 크고 20보다 작다
        boolean result = c > 10 && c < 20; //(a > 10) && (a < 20)
        System.out.println("result = " + result);

    }
}
