package Operator;

//3강_1
public class HelloJava3_1 {
    public static void main(String[] args){
        // 덧셈
        int a=5;
        int b=2;

        int sum =a+b;
        System.out.println("a+b = " + sum);

        // 뺄셈
        int diff=a-b;
        System.out.println("a-b = " + diff);

        // 곱셈
        int multi=a*b;
        System.out.println("a*b = " + multi);

        // 나눗셈 (!0으로 나눌 수 없음!)
        int div=a/b;
        System.out.println("a/b = " + div);

        // 나머지
        int mod=a%b;
        System.out.println("a%b = " + mod);
    }
}
