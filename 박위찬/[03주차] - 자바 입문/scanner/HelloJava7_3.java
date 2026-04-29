package scanner;

import java.util.Scanner;

//7강_3
public class HelloJava7_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 숫자 입력");
        int num1 = scanner.nextInt();

        System.out.println("두번째 숫자 입력");
        int num2 = scanner.nextInt();

        if (num1>num2){
            System.out.println("첫번째 수 "+num1+"이 두번째 수 " + num2+"보다 크다");
        } else if (num2>num1) {
            System.out.println("두번째 수 "+num2+"이 첫번째 수 " + num1+"보다 크다");
        } else{
            System.out.println("두 숫자가 같다");
        }
    }
}
