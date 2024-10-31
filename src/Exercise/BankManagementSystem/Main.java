package Exercise.BankManagementSystem;
;

public class Main {
    public static void main(String[] args) throws Exception {
        try{

            CurrentAccount account = new CurrentAccount(1000000);

            System.out.println(account.accountBalance);

            account.withdrawAmount(1000000000);

            System.out.println(account.accountBalance);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
