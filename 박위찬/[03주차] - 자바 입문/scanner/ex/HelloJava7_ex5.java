package scanner.ex;

import java.util.Scanner;

//7강
public class HelloJava7_ex5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.print("가격을 입력하세요");
            int price = scanner.nextInt();

            if (price==-1){
                break;
            }
            System.out.print("수량을 입력하세요");
            int num = scanner.nextInt();

            int totalprice= num*price;
            System.out.println("totalprice = " + totalprice);


        }
    }
}
