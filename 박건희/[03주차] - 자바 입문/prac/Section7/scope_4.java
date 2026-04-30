package Section7;

public class scope_4 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647;
        long maxIntOver = 2147483648L;
        int intValue = 0;
        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting=" + intValue);
        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting=" + intValue);

        int div1 = 3 / 2;
        System.out.println("div1 = " + div1);
        double div2 = 3 / 2;
        System.out.println("div2 = " + div2);
        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3);
        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4);
        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result);
    }
}
