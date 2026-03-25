package Operator;

//3강_5
public class HelloJava3_5 {
    public static void main(String[] args){

        //비교 연산자 종류
        int a=2;
        int b=3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //결과를 boolean변수에 담을 수 있음
        boolean result= a==b;
        System.out.println(result);

        //문자열 비교(==이 아니라.equals() 메서드를 사용)
        String str1="문자열1";
        String str2="문자열2";

        boolean result1="hellow".equals("hellow"); //리터럴 비교
        boolean result2=str1.equals("문자열1");  //문자열 변수, 리터럴 비교
        boolean result3=str1.equals(str2);  // 문자열 변수 비교

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
