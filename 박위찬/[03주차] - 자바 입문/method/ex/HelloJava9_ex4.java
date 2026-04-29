package method.ex;

import java.util.Scanner;

//9강
public class HelloJava9_ex4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int option = 0;
        int balance =0;
        while (true){
            menu();
            option = input.nextInt();
            if (option==1){
                System.out.println("입금액 입력");
                int amount = input.nextInt();
                balance = deposit(balance, amount);
            } else if (option==2) {
                System.out.println("출금액 입력");
                int amount = input.nextInt();
                balance = withdraw(balance, amount);
            } else if (option==3) {
                System.out.println("현재 진액"+balance+"원");
            } else {
                System.out.println("종료합니다.");
                break;
            }
        }
    }
    public static void menu(){
        System.out.println("------------------------------");
        System.out.println("1.입급 | 2.출금 | 3.잔액 | 4.종료");
        System.out.println("------------------------------");
    }
    public static int deposit(int balance, int amount){
        balance+=amount;
        System.out.println(amount+"원 입금. 현재 잔액 : "+balance+"원");
        return balance;
    }
    public static int withdraw(int balance, int amount){
        if (balance<amount){
            System.out.println("잔액 부족");
        } else {
            balance-=amount;
            System.out.println(amount+"원 출금. 현재 잔액 : "+balance+"원");
        }
        return balance;
    }
}
