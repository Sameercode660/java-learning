package Exercise.BankManagementSystem;

public class SavingAccount extends BankAccount{

    private static final double MAX_ACCOUNT_BALANCE = 2000000;
    private static final double MIN_ACCOUNT_BALANCE = 10000;

    public SavingAccount(double amount) throws Exception {
            if(isEligibleForDeposit(amount)) {
                throw new Exception("Account deposit limit reached");
            }

            this.depositAmount(amount);
    }

    public void depositAmount(double amount) throws Exception {
        if(isEligibleForDeposit(amount)) {
            throw  new Exception("Account deposit limit reached");
        }
        this.deposit(amount);

    }

    public double withdrawAmount(double amount) throws Exception {
        if(!isEligibleForWithdraw(amount)) {
            throw new Exception("Minimum 10000 Balance should remain while withdraw");
        }

        this.withdraw(amount);

        return this.accountBalance;
    }


    // helper function
    private boolean isEligibleForDeposit(double amount) {
        if((this.accountBalance + amount) > MAX_ACCOUNT_BALANCE) {
            return true;
        }
        return false;
    }

    private  boolean isEligibleForWithdraw(double amount) {
        if((this.accountBalance - amount) < MIN_ACCOUNT_BALANCE) {
            return  false;
        }
        return true;
    }

}
