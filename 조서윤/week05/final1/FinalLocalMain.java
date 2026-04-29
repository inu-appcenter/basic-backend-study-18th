package week05.final1;

public class FinalLocalMain {

    static void main() {
        //final 지역 변수
        final int data1;
        data1 = 10; //최초 한번만 할당 가능
        //data1 = 20; //컴파일 오류

        //final 지역 변수2
        final int data2 = 10;
        //data2 = 20; //컴파일 오류
    }

    //final 매개변수
    static void method(final int parameter) {
        //parameter = 20; 컴파일 오류
    }
}
