package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*int option = 0;
        int price = 0;
        int totalCost = 0;
        int quantity = 0;

        System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
        while ((option = scanner.nextInt())!= 3) {
            scanner.nextLine();
            if( option == 1){
                System.out.print("상품명을 입력하세요: ");
                String product = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                price = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                quantity = scanner.nextInt();

                int value = price * quantity;
                System.out.println("상품명: "+ product + " 가격: " + price + " 수량: " + quantity + " 합계: "+ value);
                totalCost += value;
            }

            if( option == 2){
                System.out.println("총 비용: " + totalCost);
                totalCost = 0;
            }

            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
        }*/
        int totalCost = 0;
        boolean running = true;
        while (running) {
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1:
                    System.out.print("상품명을 입력하세요: ");
                    String product = scanner.nextLine();

                    System.out.print("상품의 가격을 입력하세요: ");
                    int price = scanner.nextInt();

                    System.out.print("구매 수량을 입력하세요: ");
                    int quantity = scanner.nextInt();

                    System.out.println("상품명: "+ product + " 가격: " + price + " 수량: " + quantity + " 합계: "+ price * quantity);
                    totalCost += price * quantity;
                    break;
                case 2:
                    System.out.println("총 비용: " + totalCost);
                    totalCost = 0;
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    running = false;
                    break;
                default:
                    System.out.println("올바른 입력을 해주세요");
            }
            /*if( option == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if ( option == 1) {
                System.out.print("상품명을 입력하세요: ");
                String product = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = scanner.nextInt();

                System.out.println("상품명: "+ product + " 가격: " + price + " 수량: " + quantity + " 합계: "+ price * quantity);
                totalCost += price * quantity;
            } else if ( option == 2) {
                System.out.println("총 비용: " + totalCost);
                totalCost = 0;
            } else {
                System.out.println("올바른 입력을 해주세요");
            }*/

        }





    }
}
