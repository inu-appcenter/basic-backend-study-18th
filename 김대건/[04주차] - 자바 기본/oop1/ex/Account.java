package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount){
        balance += amount;
        System.out.println(amount + "원을 입금했습니다. 현재 금액: " +  balance + "원");
    }
    void withdraw(int amount){
        if(balance < amount){
            System.out.println("잔액이 부족합니다. 현재 금액 : " + balance+ "원");
        } else {
            balance -= amount;
            System.out.println(amount + "원을 인출했습니다. 현재 금액: " +  balance+ "원");
        }
    }
    void showStatus(){
        System.out.println("잔고 : " + balance+ "원");
    }

}
