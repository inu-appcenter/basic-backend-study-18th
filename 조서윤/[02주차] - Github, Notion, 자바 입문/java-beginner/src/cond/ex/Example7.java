package cond.ex;

public class Example7 {

    static void main() {
        int x = 2;

        String result = (x % 2) == 0 ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + result);
    }
}
