package cond.ex;

import java.util.Scanner;

public class ScoreEx {
    public static void main(String[] args){
        int score;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("score :");
            score = sc.nextInt();

            if (score == -1)
                break;

            if (score >=90){
                System.out.println("A");
            }
            else if(score < 90 && score>=80){
                System.out.println("B");
            }
            else if(score<80 && score>=70){
                System.out.println("C");
            }
            else if(score<70 && score>=60) {
                System.out.println("D");
            }
            else
                System.out.println("F");
        }
    }
}
