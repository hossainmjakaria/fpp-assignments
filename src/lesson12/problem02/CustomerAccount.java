package lesson12.problem02;

public class CustomerAccount {
    String cusName;
    long accNo;
    double balance;

    public CustomerAccount(String cusName, long accNo, double balance) {
        this.cusName = cusName;
        this.accNo = accNo;
        this.balance = balance;
    }

    public boolean deposit(double amount) throws InsufficientBalanceException {
        if (amount < 0) return false;
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) throws InsufficientBalanceException {
        if (amount > 0 && amount <= balance) {
            balance -= amount;

            if (balance < 100)
                throw new InsufficientBalanceException("Balance reached below $100");
            return true;
        } else {
            throw new InsufficientBalanceException("Withdraw amount exceeds the balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}
