import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("=== Bank Management System ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter Account Number : ");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Account Holder Name : ");
                    String name = sc.nextLine();

                    bankService.createAccount(accNo, name);
                    break;
                case 2:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();

                    BankAccount acc = bankService.findAccount(accNo);
                    if(acc != null) {
                        System.out.print("Enter amount to deposit: ");
                        double amt = sc.nextDouble();
                        acc.deposit(amt);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();

                    acc = bankService.findAccount(accNo);
                    if(acc != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double amt = sc.nextDouble();
                        acc.withdraw(amt);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();

                    acc = bankService.findAccount(accNo);
                    if(acc != null) {
                        System.out.println("Balance: " + acc.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using Bank Management System.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }

        }
    }
}
