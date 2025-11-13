// File Name: BankManagement.java
import java.util.ArrayList;
import java.util.Scanner;

public class BankManagement {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== Bank Management System ===");
            System.out.println("1. Add Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Accounts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch(choice) {
                case 1:
                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();
                    accounts.add(new BankAccount(name, accNo, bal));
                    System.out.println("Account created successfully!\n");
                    break;
                case 2:
                    System.out.print("Enter Account Number: ");
                    int depAcc = sc.nextInt();
                    System.out.print("Enter Amount to Deposit: ");
                    double depAmt = sc.nextDouble();
                    boolean foundDep = false;
                    for(BankAccount a : accounts) {
                        if(a.getAccountNumber() == depAcc) {
                            a.deposit(depAmt);
                            foundDep = true;
                        }
                    }
                    if(!foundDep) System.out.println("Account not found!");
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    int withAcc = sc.nextInt();
                    System.out.print("Enter Amount to Withdraw: ");
                    double withAmt = sc.nextDouble();
                    boolean foundWith = false;
                    for(BankAccount a : accounts) {
                        if(a.getAccountNumber() == withAcc) {
                            a.withdraw(withAmt);
                            foundWith = true;
                        }
                    }
                    if(!foundWith) System.out.println("Account not found!");
                    break;
                case 4:
                    if(accounts.isEmpty()) System.out.println("No accounts found.");
                    else {
                        for(BankAccount a : accounts) {
                            a.display();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice != 5);
        sc.close();
    }
}
