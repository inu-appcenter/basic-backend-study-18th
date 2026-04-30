package Section8;

import java.util.Scanner;

public class scanner_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine();
        System.out.println("입력한 문자열: " + str);
        System.out.print("정수를 입력하세요:");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수: " + intValue);
        System.out.print("실수를 입력하세요:");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수: " + doubleValue);

        System.out.print("첫 번째 숫자를 입력하세요:");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요:");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("두 숫자의 합: " + sum);

        System.out.print("첫 번째 숫자를 입력하세요:");
        int num3 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요:");
        int num4 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("더 큰 숫자: " + num3);
        } else if (num2 > num1) {
            System.out.println("더 큰 숫자: " + num4);
        } else {
            System.out.println("두 숫자는 같습니다.");
        }
    }
}
