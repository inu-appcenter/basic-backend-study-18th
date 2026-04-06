package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        int balance = 0;
        while(running){
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액확인 | 4.종료 ");
            System.out.println("---------------------------------");
            System.out.print("선택: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    int depositAmount = scanner.nextInt();
                    balance = deposit(depositAmount,balance);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    int withdrawAmount = scanner.nextInt();
                    balance = withdraws(withdrawAmount,balance);
                    break;
                case 3:
                    System.out.println("현재 잔액: " + balance+"원 입니다.");
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    running = false;
                    break;
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }
        }
    }

    public static int deposit(int depositAmount, int balance){
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하셨습니다. 현재 잔액: "+ balance +"원");
        return balance;
    }
    public static int withdraws(int withdrawAmount, int balance){
        if(balance < withdrawAmount){
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
            return balance;
        }
        balance -= withdrawAmount;
        System.out.println(withdrawAmount + "원을 출금하셨습니다. 현재 잔액: "+ balance +"원");
        return balance;
    }
}
