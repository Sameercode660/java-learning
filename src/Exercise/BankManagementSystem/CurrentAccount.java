package Exercise.BankManagementSystem;

public class CurrentAccount extends BankAccount{

    public CurrentAccount(double amount) {
        this.deposit(amount);
    }

    public void depositeAmount(double amount) {
        this.deposit(amount);
    }

    public double withdrawAmount(double amount) throws Exception {
        if((this.accountBalance - amount) < 0) {
            throw new Exception("Insufficient Balance in your account");
        }
        withdraw(amount);

        return this.accountBalance;
    }
}
