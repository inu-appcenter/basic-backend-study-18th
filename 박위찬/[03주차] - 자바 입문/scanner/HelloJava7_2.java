package scanner;

import java.util.Scanner;

//7강_2
public class HelloJava7_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 숫자를 입력하세요.");
        int num1 = scanner.nextInt();

        System.out.println("두번째 숫자를 입력하세요.");
        int num2 = scanner.nextInt();
        int sum = num2+num1;
        System.out.println("sum = " + sum);

    }
}
