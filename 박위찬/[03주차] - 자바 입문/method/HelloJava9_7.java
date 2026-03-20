package method;

//9강-7
public class HelloJava9_7 {
    public static void main(String[] args){
        //메서드를 호출할 때도 형변환이 적용된다.
        // 메서드 호출과 명시적 형변환, 자동 형변환에 대해 알아보자.

        double number = 1.5;
        //printNumber(number);는 불가능 : n이 정수형이라 실수형을 받지 못함
        printNumber((int)number);
        printNumber2(number);

    }
    public static void printNumber(int n){
        System.out.println("n = " + n);
    }
    public static void printNumber2(double n) {
        System.out.println("n = " + n);
    }
}
