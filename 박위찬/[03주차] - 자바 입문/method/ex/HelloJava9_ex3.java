package method.ex;

//9강
public class HelloJava9_ex3 {
    public static void main(String[] args){
        int balance = 10000;

        balance = deposit(balance, 1000);
        balance = withdraw(balance, 2000);
        System.out.println("최종 잔액: " + balance + "원");
    }
    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }
    public static int withdraw(int balance, int amount){
        if (balance < amount){
            System.out.println("잔돈 부족");
        } else {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        }
        return balance;
    }
}
