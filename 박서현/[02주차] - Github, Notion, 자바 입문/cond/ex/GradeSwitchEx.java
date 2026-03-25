package cond.ex;

import java.util.Scanner;

public class GradeSwitchEx {

    public static void main(String[] args){
        String grade;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("grade :");
            grade = sc.nextLine();

            switch (grade) {
                case "A":
                    System.out.println("탁월한 성과입니다!");
                    break;
                case "B":
                    System.out.println("좋은 성과입니다.");
                    break;
                case "C":
                    System.out.println("준수한 성과입니다.");
                    break;
                case "D":
                    System.out.println("향상이 필요합니다.");
                    break;
                default:
                    System.out.println("잘못된 학점입니다.");
            }
        }
    }
}
