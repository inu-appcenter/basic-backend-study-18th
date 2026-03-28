package cond.ex;

import java.util.Scanner;

public class EvenOddEx {
    public static void main(String[] args){
        int x;
        String eo;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("x: ");
            x = sc.nextInt();

            if (x == -1) break;
            eo = (x % 2 == 1) ? "홀수" : "짝수";
            System.out.println("x= " + x + ", " + eo);
        }


    }
}
