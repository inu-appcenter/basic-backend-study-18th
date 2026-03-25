package Session10;

public class Ex2 {
    static void main(String[] args) {
        String message = "hello";
        printMessage(message, 5);
    }
    public static void printMessage(String message, int times){
        for (int i =0;i<times;i++){
            System.out.println(message);
        }
    }
}
