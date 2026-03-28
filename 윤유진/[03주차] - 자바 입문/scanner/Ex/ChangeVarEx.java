package scanner.Ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
