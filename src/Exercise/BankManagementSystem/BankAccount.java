package Exercise.BankManagementSystem;

public class BankAccount {

    protected double accountBalance;

    public BankAccount(double balance) {
        this.accountBalance = balance;
    }

    public BankAccount() {}

    public double deposit(double amount) {
        this.accountBalance += amount;

        return this.accountBalance;
    }


    public double withdraw(int amount) {
        double result = (double)(this.accountBalance - (double) (amount));
        System.out.println(result);
        return result;
    }

}
