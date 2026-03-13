package loop.ex;

public class Example1 {

    static void main() {
        int count = 0;

        while (count < 10) {
            count++;
            System.out.println(count);
        }

        System.out.println();

        for (int cnt = 1; cnt <= 10; cnt++) {
            System.out.println(cnt);
        }
    }
}
