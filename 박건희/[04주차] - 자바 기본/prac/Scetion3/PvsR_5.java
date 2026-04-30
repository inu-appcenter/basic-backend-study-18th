package Scetion3;

public class PvsR_5 {
    static void main() {

        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);

        data = null;
        // data = new Data();로 변경 필요
        data.value = 10;// NullPointerException 예외 발생
        System.out.println("data = " + data.value);

    }
}
