package array.ex;

import java.util.Scanner;

//8강
public class HelloJava8_ex7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //1번(3)
        int i =0 ;
        int[] price = new int[4];
        String[] name = new String[4];
        while (true){
            System.out.println("1:상품 등록, 2:상품 목록, 3:종료");
            int option = input.nextInt();
            input.nextLine();
            if (option==1){
                if (i>=4){
                    System.out.println("더이상 등록 불가능합니다.");
                } else{
                    System.out.println("상품 이름을 입력하세요");
                    name[i] = input.nextLine();
                    System.out.println("상품 가격을 입력하세요");
                    price[i] = input.nextInt();
                    input.nextLine();
                    i++;

                }

            } else if (option==2) {
                if (i==0){
                    System.out.println("등록된 상품 없음");
                } else {
                    for (int j = 0; j < i; j++) {
                        System.out.println(name[j] + " : " + price[j]);
                    }
                }
            } else if (option==3){
                System.out.println("종료");
                break;
            } else {
                System.out.println("존재하지 않는 옵션");
            }
        }
    }
}
