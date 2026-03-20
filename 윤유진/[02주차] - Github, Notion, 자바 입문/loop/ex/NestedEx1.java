package loop.ex;

public class NestedEx1 {
    public static void main(String[] args) {
        //1 * 1 = 1
        //1 * 2 = 2
        //1 * 3 = 3
        //1 * 4 = 4
        //1 * 5 = 5
        //1 * 6 = 6
        //1 * 7 = 7
        //1 * 8 = 8
        //1 * 9 = 9
        //   ...
        //9 * 9 = 81

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
