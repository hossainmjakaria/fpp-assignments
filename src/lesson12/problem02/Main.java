package lesson12.problem02;

public class Main {
    public static void main(String[] args) {
        try {
            CustomerAccount account = new CustomerAccount("Daniel Longbowou Blandes", 654321, 500.0);

            account.deposit(100.0);
            System.out.println("Current balance: " + account.getBalance());

            account.withdraw(200.0);
            System.out.println("Current balance: " + account.getBalance());

            account.withdraw(500.0);
            System.out.println("Current balance: " + account.getBalance());


        } catch (InsufficientBalanceException ex) {
            System.out.println("Exception occurred: " + ex.getMessage());
        }
    }

}
