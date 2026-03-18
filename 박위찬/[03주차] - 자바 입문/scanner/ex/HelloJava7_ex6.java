package scanner.ex;

import java.util.Scanner;

//7강
public class HelloJava7_ex6 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int count=0;
        double average=0;

        while (true){
            System.out.println("숫자를 입력하세요");
            int num = scanner.nextInt();
             if (num==-1){
                 System.out.println("합계 = "+sum);
                 System.out.println("평균 = "+average);
                 break;
             }
             sum+=num;
             num=0;
             count++;
             average=(double) sum/count;

        }
    }
}
