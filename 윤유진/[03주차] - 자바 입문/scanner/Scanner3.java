package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수 입력: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수 입력: ");
        int num2 = scanner.nextInt();

        int big = (num1 > num2) ? num1 : num2;

        System.out.print("둘 중 더 큰 수는: " + big);

        //정답은 else if문으로 두 수가 같은 경우까지 표현
    }
}
