package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
        int option = scanner.nextInt();
        int tempPrice;
        int totalPrice = 0;
        while(option != 3){
            scanner.nextLine();
            if (option == 1){
                System.out.print("상품명을 입력하세요: ");
                String product = scanner.nextLine();
                System.out.print("상품 가격을 입력하세요: ");
                int productPrice = scanner.nextInt();
                System.out.print("구매 수량을 입력하세요: ");
                int productQuantity = scanner.nextInt();
                tempPrice = productPrice * productQuantity;
                totalPrice += tempPrice;
                tempPrice = 0;
            } else if (option == 2) {
                System.out.println("총 비용:" + totalPrice + "원");
                totalPrice = 0;
            }else {
                System.out.println("올바른 옵션을 선택해주세요");
            }
                System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
                option = scanner.nextInt();

        }
        System.out.println("프로그램을 종료합니다");
    }
}
