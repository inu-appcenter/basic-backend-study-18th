package method.ex;

public class Example2 {

//    static void main() {
//        String message = "Hello, world!";
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(message);
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(message);
//        }
//        for (int i = 0; i < 7; i++) {
//            System.out.println(message);
//        }
//    }

    static void main() {
        String message = "Hello, world!";

        printMessage(message, 3);
        printMessage(message, 5);
        printMessage(message, 7);
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
