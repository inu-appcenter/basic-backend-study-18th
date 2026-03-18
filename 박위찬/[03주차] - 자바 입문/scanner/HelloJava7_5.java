package scanner;

import java.util.Scanner;

//7강_5
public class HelloJava7_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("첫 숫자 입력");
            int a = scanner.nextInt();

            System.out.println("둘 숫자 입력");
            int b = scanner.nextInt();

            if (a==0 && b==0){
                System.out.println("종료합니다.");
                break;
            } else {
                int sum = a + b;
                System.out.println(sum);
            }
        }
    }
}
