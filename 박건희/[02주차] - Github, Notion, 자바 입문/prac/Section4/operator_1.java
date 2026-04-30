package Section4;
// 연산자
public class operator_1 {
    static void main(){

        int a=5, b=2;
        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 출력: a + b = 7
        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff); // 출력: a - b = 3
        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi); // 출력: a * b = 10
        // 나눗셈
        int div = a / b;
        System.out.println("a / b = " + div); // 출력: a / b = 2
        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod); // 출력: a % b = 1, 수학에서 허용하지 않는 x/0는 오류를 발생시킴.


    }
}
