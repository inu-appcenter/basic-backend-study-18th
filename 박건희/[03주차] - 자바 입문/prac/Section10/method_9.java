package Section10;

public class method_9 {

    public static void main(String[] args) {
        myMethod(1, 1.2);
        myMethod(1.2, 2);

        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1.2, 1.5));
    }

    public static void myMethod(int a, double b) {
        System.out.println("int a, double b");
    }

    public static void myMethod(double a, int b) {
        System.out.println("double a, int b");
    }


    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
