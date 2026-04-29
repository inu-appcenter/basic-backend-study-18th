package memory;

public class JavaMemoryMain2 {
    static void main(String[] args) {
        System.out.println("메인 시작");
        method1();
        System.out.println("메인 끝");
    }
    static void method1(){
        System.out.println("메서드1 시작");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("메서드1 끝");

    }
    static void method2(Data data2){
        System.out.println("메서드2 시작");
        System.out.println(data2.getValue());
        System.out.println("메서드2 끝");

    }
}
