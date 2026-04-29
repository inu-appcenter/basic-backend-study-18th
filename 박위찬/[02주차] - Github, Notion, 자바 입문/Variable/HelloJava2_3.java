package Variable;

//2강_3
public class HelloJava2_3 {
    public static void main(String[] args){
        int a=100; //정수
        double b=10.5; //실수
        boolean c= true; //불리언(true, false)
        char d='A'; //문자 '하나'(작은 따옴표)
        String e="hellow Java"; //문자열(큰 따옴표), !String 맨 앞 대문자

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        //정수 (높을수록 메모리가 큼->보통 int를 사용)
        byte t = 127; //-128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; //+- 21억
        long l = 9223372036854775807L; // 가장 많음
        //실수 (보통 double를 사용)
        float f = 10.0f; //2의 32승
        double o = 10.0; //2의 64승
    }
}
