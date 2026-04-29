package memory;

public class JavaMemoryMain1 {
    static void main(String[] args) {
        System.out.println("메인 시작");
        method1(10);
        System.out.println("메인 끝");
    }
    static void method1(int m1){
        System.out.println("메서드1 시작");
        int cal = m1*2;
        method2(cal);
        System.out.println("메서드1 끝");

    }
    static void method2(int m2){
        System.out.println("메서드2 시작");
        System.out.println("메서드2 끝");

    }
}
