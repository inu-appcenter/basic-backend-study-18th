package Session8;

import java.util.Scanner;

public class Food {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요: ");
        String food = scanner.nextLine();

        System.out.print("음식의 가격을 입력해주세요: ");
        int price = scanner.nextInt();

        System.out.print("음식의 수량을 입력해주세요: ");
        int count = scanner.nextInt();

        System.out.println(food+" "+count+"개 를 주문하셨습니다. 총 가격은 "+price*count);
    }
}
