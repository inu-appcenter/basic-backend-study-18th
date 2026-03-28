package loop;

public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;
//        sum = sum + i;
//        System.out.println("i=" + i + " sum=" + sum);
//        i++;
//        sum = sum + i;
//        System.out.println("i=" + i + " sum=" + sum);
//        i++;
//        sum = sum + i;
//        System.out.println("i=" + i + " sum=" + sum);
//        i++;
        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }

    }
}
