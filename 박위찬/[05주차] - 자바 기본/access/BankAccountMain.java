package access;

import opp1.ex.Account;

public class BankAccountMain {
    static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("잔액 : "+account.getBalance());
    }
}
