package Section10;

public class method_3 {

    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {

        if (i % 2 == 1) {
            return true;
        }
        else{
                return false;
        }
    }
}
