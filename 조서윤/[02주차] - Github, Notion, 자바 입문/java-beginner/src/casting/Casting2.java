package casting;

public class Casting2 {

    static void main() {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; //컴파일 오류 발생
        intValue = (int) doubleValue; //형변환
        System.out.println(intValue); //출력:1
        System.out.println("doubleValue = " + doubleValue);

        int z = (int) 10.5;
        System.out.println(z);
    }
}
