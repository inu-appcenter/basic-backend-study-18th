package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        //final 지역변수 1
        final int data1;
        data1 = 10; //최초 한번만 할당 가능

        final int data2 = 10;
        //data2 = 20; 컴파일 오류
    }

    static void method(final int parameter) {
        //컴파일 오류 parameter = 20;
    }
}
