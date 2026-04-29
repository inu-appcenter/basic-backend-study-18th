class BankAccount {
    private int balance;
    public BankAccount() {
        balance = 0;
    }
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        }
    }
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        }
    }
    public int getBalance() {
        return balance;
    }
    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("balance = " + account.getBalance());
    }
}