package scanner;

import java.util.Scanner;

//7강_6
public class HelloJava7_6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("숫자 입력");
            int a = scanner.nextInt();

            if (a==0){
                System.out.println("종료합니다.");
                break;
            } else {
                sum += a;
                a =0;
            }
        }
        System.out.println("총 합"+sum);
    }
}
