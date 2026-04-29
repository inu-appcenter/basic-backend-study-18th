package scanner.ex;

import java.util.Scanner;

//7강
public class HelloJava7_ex7 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int totalprice=0;
        while (true){
            System.out.println("1:상품 입력, 2:결제, 3:프로그램 종료");
            int option = scanner.nextInt();

            if (option==1){
                scanner.nextLine(); // 이전에 입력된 개행문자 제거
                System.out.println("상품명 입력");
                String name = scanner.nextLine();

                System.out.println("가격 입력");
                int price = scanner.nextInt();

                System.out.println("구매 수량 입력");
                int quantity = scanner.nextInt();
                totalprice += price*quantity;
                System.out.println("상품명 : "+name+", 가격 : "+price+", 수량 : "+quantity);

            } else if (option==2) {
                System.out.println("총 비용 : "+totalprice);
                totalprice=0;
            } else if (option==3) {
                System.out.println("종료합니다.");
                break;
            } else{
                System.out.println("옵션에 존재하지 않음");
            }

        }

    }
}
