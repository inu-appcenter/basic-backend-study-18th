package Session10;

public class Ex3 {
    static void main(String[] args) {
        int balance = 10000;

        balance = plus(balance, 1000);
        balance = minor(balance, 2000);
        System.out.println("최종 잔액: "+balance+"원");
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
