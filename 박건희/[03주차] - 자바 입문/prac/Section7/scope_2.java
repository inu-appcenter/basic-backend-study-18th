package Section7;

public class scope_2 {
    public static void main(String[] args) {
        int  m = 10;
        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);

        int sum = 0;
        int i = 1;
        int endNum = 3;
        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }

        sum = 0;
        endNum = 3;
        for (i = 1; i <= endNum; i++) {
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
        }

    }
}
