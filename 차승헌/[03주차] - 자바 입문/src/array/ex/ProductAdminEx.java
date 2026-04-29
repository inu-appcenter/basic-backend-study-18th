package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. 상품 등록, 2. 상품 목록, 3. 종료");
        int menu = scanner.nextInt();
        while(true){
            if (menu == 1){
                scanner.nextLine();
                System.out.print("상품 이름: ");
                productNames[productCount] = scanner.nextLine();
                System.out.println("상품 가격: ");
                productPrices[productCount]= scanner.nextInt();
                productCount++;
            } else if (menu == 2) {
                for (int i = 0;i<productCount;i++){
                    System.out.println(productNames[i] + " : " + productPrices[i]);
                }
            }else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("1. 상품 등록, 2. 상품 목록, 3. 종료");
            menu = scanner.nextInt();
        }

    }
}
