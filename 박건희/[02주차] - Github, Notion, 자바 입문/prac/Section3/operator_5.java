package Section3;
//비교 연산자
public class operator_5 {
    static void main() {

        int a = 2;
        int b = 3;

        System.out.println(a == b); // false, a와 b는 같지 않다
        System.out.println(a != b); // true, a와 b는 다르다
        System.out.println(a > b); // false, a는 b보다 크지 않다
        System.out.println(a < b); // true, a는 b보다 작다
        System.out.println(a >= b); // false, a는 b보다 크거나 같지 않다
        System.out.println(a <= b); // true, a는 b보다 작거나 같다

        //결과를 boolean 변수에 담기
        boolean result = a == b; //a == b: false
        System.out.println(result);

        String str1 = "문자열1";
        String str2 = "문자열2";

        // <문자열>.equals(); 문자열 비교연산자

        boolean result1 = "hello".equals("hello"); //리터럴 비교
        boolean result2 = str1.equals("문자열1");//문자열 변수, 리터럴 비교
        boolean result3 = str1.equals(str2);//문자열 변수 비교

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

    }
}
