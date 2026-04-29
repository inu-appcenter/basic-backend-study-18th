package Session10;

import java.util.Scanner;

public class Ex4 {
    static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("--------------");
            System.out.println("1.입금 2.출금 3.잔액확인 4.종료");
            System.out.println("--------------");

            int choice = scanner.nextInt();
            int amount;

            if (choice == 1) {
                System.out.print("입금액을 입력하세요:");
                amount = scanner.nextInt();
                balance = plus(balance, amount);
            }
            else if (choice == 2){
                System.out.print("출금액을 입력하세요:");
                amount = scanner.nextInt();
                balance = minor(balance, amount);
            }
            else if (choice == 3){
                System.out.println("잔액 확인");
                System.out.print("현재 금액: "+balance);
            }
            else{
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
    public static int plus(int balance, int amount){
        balance += amount;
        System.out.println(amount+"원을 입금하였음. 현재 잔액 : "+balance+"원");
        return balance;
    }
    public static int minor(int balance, int amount){
        balance -= amount;
        System.out.println(amount+"원을 출금하였음. 현재 잔액 : "+balance+"원");
        return balance;
    }
}
