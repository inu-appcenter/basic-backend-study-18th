package scanner.ex;

import java.util.Scanner;

//7강
public class HelloJava7_ex1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요");
        String name = scanner.nextLine();

        System.out.print("나이를 입력하세요");
        int age = scanner.nextInt();

        System.out.println(age+name);

        System.out.print("정수를 입력하세요");
        int intValue = scanner.nextInt();

        if (intValue%2==0){
            System.out.println("짝수->" + intValue);
        } else {
            System.out.println("홀수->" + intValue);
        }

    }
}
