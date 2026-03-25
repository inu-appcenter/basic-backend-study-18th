package Section8;

import java.util.Scanner;

public class scanner_4 {
    public static void main(String[] args) {

        // Q1.
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요:");
        String name = scanner.nextLine();
        System.out.print("당신의 나이를 입력하세요:");
        int age = scanner.nextInt();
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살입니 다.");


        // Q2.
        System.out.print("하나의 정수를 입력하세요:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("입력한 숫자 " + number + "는 짝수입니다.");
        } else {
            System.out.println("입력한 숫자 " + number + "는 홀수입니다.");
        }

        // Q3.

        Scanner input = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요: ");
        String foodName = input.nextLine();
        System.out.print("음식의 가격을 입력해주세요: ");
        int foodPrice = input.nextInt();
        System.out.print("음식의 수량을 입력해주세요: ");
        int foodQuantity = input.nextInt();
        int totalPrice = foodPrice * foodQuantity;
        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "원입니다.");

        // Q4.
        int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Q5.
        System.out.print("첫 번째 숫자를 입력하세요:");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요:");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.print("두 숫자 사이의 모든 정수:");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i != num2) {
                System.out.print(",");
            }
        }

    }
}