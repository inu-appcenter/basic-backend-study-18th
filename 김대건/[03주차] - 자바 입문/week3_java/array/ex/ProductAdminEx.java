package array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        boolean running  = true;
        while(running){
            System.out.println("1. 상품등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    if(productCount >= maxProducts){
                        System.out.println("더 이상 상품을 등록 할 수 없습니다.");
                        break;
                    }
                    System.out.print("상품의 이름을 입력하세요 : ");
                    productNames[productCount] = scanner.nextLine();
                    System.out.print("상품 가격을 입력하세요 : ");
                    productPrices[productCount] = scanner.nextInt();
                    productCount++;
                    break;
                case 2:
                    if(productCount == 0){
                        System.out.println("등록된 상품이 없습니다.");
                        break;
                    }
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                    }
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    running = false;
                    break;
                default:
                    System.out.println("잘못된 메뉴를 고르셨습니다.");
            }


        }
    }
}
