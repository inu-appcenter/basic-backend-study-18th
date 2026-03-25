package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("음식 이름을 입력하시오: ");
        String foodName = scanner.nextLine();
        System.out.print("음식 가격을 입력하시오: ");
        int foodPrice = scanner.nextInt();
        System.out.print("음식 갯수를 입력하시오: ");
        int foodQuantity = scanner.nextInt();
        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + foodPrice * foodQuantity + "원입니다.");

    }
}
