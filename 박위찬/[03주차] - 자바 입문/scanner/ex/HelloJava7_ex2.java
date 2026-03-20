package scanner.ex;

import java.util.Scanner;

//7강
public class HelloJava7_ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식을 입력하세요");
        String name = scanner.nextLine();

        System.out.print("가격을 입력하세요");
        int price = scanner.nextInt();

        System.out.print("수량을 입력하세요");
        int number = scanner.nextInt();

        int totalPrice = price*number;

        System.out.println("피자"+number+"개 주문. 총 가격은"+totalPrice+"입니다");

        System.out.print("단 수를 입력하세요");
        int number2 = scanner.nextInt();

        for (int i=1; i<=9; i++){
            System.out.println(number2*i);
        }
    }
}
