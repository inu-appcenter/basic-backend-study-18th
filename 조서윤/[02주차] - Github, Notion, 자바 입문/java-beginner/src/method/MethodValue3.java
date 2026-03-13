package method;

public class MethodValue3 {

    static void main() {
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1: " + num1);
        num1 = changeNumber(num1);
        System.out.println("changeNumber 호출 후, num1: " + num1);
    }

    public static int changeNumber(int num2) {
        num2 = num2 * 2;
        return num2;
    }
}
