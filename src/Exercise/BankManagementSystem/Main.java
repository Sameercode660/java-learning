package Exercise.BankManagementSystem;
;

public class Main {
    public static void main(String[] args) throws Exception {

        SavingAccount account = new SavingAccount(2000);

        System.out.println(account.accountBalance);

        account.deposit(20000);

        System.out.println(account.accountBalance);

        account.withdraw(16000);

        System.out.println(account.accountBalance);

    }
}
