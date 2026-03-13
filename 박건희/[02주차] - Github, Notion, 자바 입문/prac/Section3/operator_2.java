package Section3;
//연산자로 문자열 더하기
public class operator_2 {
    static void main() {

        // 연산자를 이용하여 두 문자열을 연결할 수 있음.
        // 문자열과 문자열 더하기
        String result1 = "hello " + "world";
        System.out.println(result1);

        // 변수 이용하여 문자열 더하기
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열과 정수 더하기
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        // 변수를 이용하여 문자열과 정수 더하기
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);

        // 더해진 정수는 문자열로 변해져서 하나의 문자열로 저장/출력 됨.

    }
}
