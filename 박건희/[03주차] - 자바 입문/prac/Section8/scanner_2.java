package Section8;

import java.util.Scanner;

public class scanner_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("문자열을 입력하세요(exit: 종료):");
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열: " + str);
        }

        System.out.println("첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료합니 다.");
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요:");
            int num1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = scanner.nextInt();
            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램 종료");
                break;
            }
            int sum = num1 + num2;
            System.out.println("두 숫자의 합: " + sum);
        }
    }
}