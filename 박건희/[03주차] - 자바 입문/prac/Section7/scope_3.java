package Section7;

public class scope_3 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;
        longValue = intValue;
        System.out.println("longValue = " + longValue);
        doubleValue = intValue;
        System.out.println("doubleValue1 = " + doubleValue);
        doubleValue = 20L;
        System.out.println("doubleValue2 = " + doubleValue);

        double doubleValue_1 = 1.5;
        int intValue_1 = 0;
        //intValue = doubleValue; //컴파일 오류 발생
        intValue_1 = (int) doubleValue_1;
        System.out.println(intValue_1);
    }
}