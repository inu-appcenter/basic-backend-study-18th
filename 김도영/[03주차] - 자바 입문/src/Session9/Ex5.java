package Session9;

import java.util.Scanner;

public class Ex5 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        while (true){
            System.out.println("1. 상품등록 | 2. 상품목록 | 3. 종료\n메뉴를 선택하세요.");
            int menu = scanner.nextInt();
            scanner.nextLine(); // nextInt하면 개행문자 생겨서 바로 입력받으려면 해야됨.

            if (menu == 1){
                if (productCount >= maxProducts){
                    System.out.println("더이상 상품을 등록할수없습니다.");
                    continue;
                }
                System.out.println("상품 이름을 입력하세요");
                productNames[productCount] = scanner.nextLine();

                System.out.println("상품 가격을 입력하세요");
                productPrices[productCount] = scanner.nextInt();

                productCount++;
            }
            else if(menu==2){
                if(productCount==0){
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for(int i=0;i<productCount;i++){
                    System.out.println(productNames[i]+":"+productPrices[i]);
                }
            }
            else if (menu==3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else{
                System.out.println("잘못 입력하셨습니다.");
            }
        }

    }
}
