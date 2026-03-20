package scanner.ex;

import java.util.Scanner;

public class Example1_2 {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("입력한 숫자 " + number + "는 짝수입니다.");
        } else {
            System.out.println("입력한 숫자 " + number + "는 홀수입니다.");
        }
    }
}
