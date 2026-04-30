package Section7;

public class BankAccountMain {

    static void main() {

        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("balance = " + account.getBalance());

    }

}
