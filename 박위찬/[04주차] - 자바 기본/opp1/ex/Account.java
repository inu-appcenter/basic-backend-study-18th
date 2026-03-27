package opp1.ex;

public class Account {
    int balance;

    void deposit(int amount){
        System.out.println(amount+"원 입금");
        balance+=amount;
    }
    void withdraw(int amount){
        if (amount>balance){
            System.out.println("잔액 부족");
        } else {
            System.out.println(amount+"원 출금");
            balance-=amount;
        }
    }
}
