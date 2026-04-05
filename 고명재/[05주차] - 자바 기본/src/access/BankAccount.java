package access;

public class BankAccount {

    private int balance;

    public  BankAccount(){
        balance = 0;
    }

    public void deposit(int amount){
        if(isAmountVaild(amount)){
            balance+= amount;
        }else{
            System.out.println("유효하지 않은 금액입니다. ");
        }
    }

    public void withdraw(int amount){
        if(isAmountVaild(amount) && balance - amount >=0 ){
            balance -= amount;
        }else{
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }


    public int getBalance(){
        return balance;
    }

    private boolean isAmountVaild(int amount){
        return amount >0;
    }

}
