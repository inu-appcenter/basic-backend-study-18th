package loop;

public class While2_3 {

    static void main() {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        while (i <= endNum) {
            sum += i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }
    }
}
