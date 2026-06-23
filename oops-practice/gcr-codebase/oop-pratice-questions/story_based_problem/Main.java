class BankAccount {
    private int accountNumber;
    private String holder;
    private double balance;

    // Static field to track total accounts
    private static int totalAccounts = 0;

    // Constructor
    BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    // Withdraw method with overdraft check
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Withdrawal Failed! Insufficient Balance.");
        }
    }

    // Display account statement
    public void getStatement() {
        System.out.println("\n----- Account Statement -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Balance        : ₹" + balance);
    }

    // Static method
    public static int getTotalAccounts() {
        return totalAccounts;
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating 3 accounts
        BankAccount acc1 = new BankAccount(101, "Gopal", 10000);
        BankAccount acc2 = new BankAccount(102, "Anil", 15000);
        BankAccount acc3 = new BankAccount(103, "Rahul", 20000);

        // ===== Account 1 : 5 Transactions =====
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.deposit(500);
        acc1.withdraw(3000);
        acc1.withdraw(12000);

        // ===== Account 2 : 5 Transactions =====
        acc2.deposit(5000);
        acc2.withdraw(2000);
        acc2.deposit(1000);
        acc2.withdraw(7000);
        acc2.withdraw(3000);

        // ===== Account 3 : 5 Transactions =====
        acc3.deposit(3000);
        acc3.withdraw(5000);
        acc3.deposit(2000);
        acc3.withdraw(1000);
        acc3.withdraw(25000);

        // Display statements
        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        // Total accounts created
        System.out.println("\nTotal Accounts Created: "
                + BankAccount.getTotalAccounts());
    }
}