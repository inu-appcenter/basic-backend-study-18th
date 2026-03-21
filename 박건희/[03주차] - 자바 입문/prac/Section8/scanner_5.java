package Section8;

import java.util.Scanner;

public class scanner_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine();
            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt();
            input.nextLine(); // 숫자 입력 후의 줄바꿈 처리
            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }

        while (true) {
            System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료): ");
            int price = input.nextInt();
            if (price == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("구매하려는 수량을 입력하세요: ");
            int quantity = input.nextInt();
            int totalCost = price * quantity;
            System.out.println("총 비용: " + totalCost);
        }
    }
}
