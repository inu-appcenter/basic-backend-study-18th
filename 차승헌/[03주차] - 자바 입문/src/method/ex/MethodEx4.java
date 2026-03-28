package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount;
        int balance = 0;
        int option;
        while(true) {
            System.out.println("-----------------------------");
            System.out.println("1.입급|2.출금|3.잔액 확인|4.종료");
            System.out.println("-----------------------------");
            System.out.print("선택: ");
            option = scanner.nextInt();
            if (option == 1){
                System.out.print("입금할 금액을 입력하세요: ");
                amount = scanner.nextInt();
                balance = deposit(balance, amount);
            } else if (option == 2) {
                System.out.print("출금할 금액을 입력하세요: ");
                amount = scanner.nextInt();
                balance = withdraw(balance, amount);
            } else if (option == 3) {
                System.out.println("현재 잔액: " + balance + "원");
            } else if (option == 4) {
                System.out.println("종료합니다");
                break;
            } else {
                System.out.println("잘못된 입력입니다");
            }
        }
    }

    public static int deposit(int balance, int amount){
        balance += amount;
        System.out.println(amount + "원을 입급하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }
    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족합니다");
        }
        return balance;
    }
}
