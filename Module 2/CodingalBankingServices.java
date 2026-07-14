import java.util.Scanner;

class BankAccount {

    private int accountNumber;
    private String customerName;
    private double balance;

    // Setter Methods
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter Methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        balance = balance + amount;
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }
}

public class CodingalBankingServices {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.print("Enter Account Number: ");
        account.setAccountNumber(sc.nextInt());

        System.out.print("Enter Customer Name: ");
        account.setCustomerName(sc.next());

        System.out.print("Enter Initial Balance: ");
        account.setBalance(sc.nextDouble());

        System.out.println("\n1. Deposit");
        System.out.println("2. Withdraw");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter Deposit Amount: ");
                double deposit = sc.nextDouble();
                account.deposit(deposit);
                break;

            case 2:
                System.out.print("Enter Withdrawal Amount: ");
                double withdraw = sc.nextDouble();
                account.withdraw(withdraw);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        System.out.println("\n----- Codingal Banking Services -----");
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Customer Name  : " + account.getCustomerName());
        System.out.println("Available Balance : ₹" + account.getBalance());

        sc.close();
    }
}