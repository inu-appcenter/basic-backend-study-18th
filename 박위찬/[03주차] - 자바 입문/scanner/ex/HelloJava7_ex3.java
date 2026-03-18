package scanner.ex;

import java.util.Scanner;

//7강
public class HelloJava7_ex3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a=10;
        int b=20;
        int temp;

        temp = a;
        a=b;
        b=temp;

        System.out.println(a+", "+b);

        System.out.println("첫 숫자 입력");
        int num1 = scanner.nextInt();

        System.out.println("둘 숫자 입력");
        int num2 = scanner.nextInt();

        if (num1>num2){
            int temp2;
            temp2 = num1;
            num1=num2;
            num2=temp2;
        }
        for(int i= num1; i<=num2; i++){
            System.out.print(i);
            if (i != num2){
                System.out.print(",");
            }
        }

    }
}
