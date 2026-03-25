package operator;

public class Logical2 {
    public static void main(String[] args) {
        int a = 15;
        //a는 10보다 크고 20보다 작다
        boolean result = a > 10 && a < 20; // 비교 연산자 먼저 수행
        System.out.println("result = " + result);
    }
}
