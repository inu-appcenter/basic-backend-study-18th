package loop.ex;

public class Example3_1 {

    static void main() {
        int max = 3;

        int sum = 0;
        int i = 1;
        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
