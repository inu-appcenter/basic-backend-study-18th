package method.ex;

public class MethodEx3 {

    public static void main(String[] args) {
        int balance = 100000;
        balance = deposit(1000,balance);
        balance = withdraws(1000000,balance);
        System.out.println("최종 잔액: "+ balance+ "원");
    }

    public static int deposit(int depositAmount, int balance){
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하셨습니다. 현재 잔액: "+ balance +"원");
        return balance;
    }
    public static int withdraws(int withdrawAmount, int balance){
        if(balance < withdrawAmount){
            System.out.println(withdrawAmount + "을 출금하려 했으나 잔액이 부족합니다.");
            return balance;
        }
        balance -= withdrawAmount;
        System.out.println(withdrawAmount + "원을 출금하셨습니다. 현재 잔액: "+ balance +"원");
        return balance;
    }
}
