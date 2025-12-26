import java.util.ArrayList;

public class BankService {
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public void createAccount(int accNo, String name) {
        BankAccount account = new BankAccount(accNo, name);
        accounts.add(account);
        System.out.println("Account created successfully.");
    }
    public BankAccount findAccount(int accNo) {
        for(BankAccount acc : accounts) {
            if(acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }
}
