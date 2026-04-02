package final1;

class ConstructInit{
    final int value1; // final 멤버 변수
    static final int VALUE2=100; // 상수

    public ConstructInit(int value){ // 최초 한번만 할당 가능
        this.value1 = value;
    }
}

public class FinalLocalMain {

    public static void main(String[] args) {

        final int data1; // final 지역변수
        data1 = 10; // 최초 한번만 할당 가능

        final int data2 = 20; // 선언, 할당 동시

        finalMethod(30); // final 매개변수

        final ConstructInit CI = new ConstructInit(40); // final 객체
    }

    static void finalMethod(final int parameter) { }
}
