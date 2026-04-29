package class3;

public class AccountMain {
    static void main(String[] args) {
        Account account = new Account();
        account.deposit(1000);
        account.withdraw(500);
        System.out.println("잔고: "+account.balance);
    }
}
