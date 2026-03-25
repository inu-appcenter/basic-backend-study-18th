package operator;

public class Comp1 {
    static void main() {
        int a = 2;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //결과를 boolean 변수에 담음
        boolean result = a == b;
        System.out.println(result);
    }
}
