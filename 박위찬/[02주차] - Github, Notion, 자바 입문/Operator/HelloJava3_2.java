package Operator;

//3강_4
public class HelloJava3_2 {
    public static void main(String[] args){
        //문자열+문자열 (1)
        String result1 = "hellow"+"world";
        System.out.println(result1);

        //문자열+문자열 (2)
        String s1 = "string1";
        String s2 = "string2";
        System.out.println(s1 + s2);

        //문자열+숫자 (1)  -> 문자열+숫자에서는 숫자를 문자로 인식
        String result3 = "a+b=" + 10;
        System.out.println(result3);

        //문자열+숫자 (2) -> 문자열+숫자에서는 숫자를 문자로 인식
        int num =20;
        String str="a+b=";
        String result4 = str+ num;
        System.out.println(result4);
    }
}
