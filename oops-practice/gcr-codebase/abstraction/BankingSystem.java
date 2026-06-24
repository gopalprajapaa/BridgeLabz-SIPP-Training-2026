abstract class BankAccount {

    private String accountNumber;
    private String holderName;
    private double balance;

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Concrete Methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : " + balance);
    }

    // Abstract Method
    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {

    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

class CurrentAccount extends BankAccount {

    private double monthlyBonusRate;

    public double getMonthlyBonusRate() {
        return monthlyBonusRate;
    }

    public void setMonthlyBonusRate(double monthlyBonusRate) {
        this.monthlyBonusRate = monthlyBonusRate;
    }

    @Override
    double calculateInterest() {
        return getBalance() * monthlyBonusRate / 100;
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount();
        sa.setAccountNumber("SA101");
        sa.setHolderName("Rishav Sharma");
        sa.setBalance(50000);
        sa.setInterestRate(5);

        sa.deposit(10000);
        sa.withdraw(5000);

        System.out.println("Savings Account");
        sa.displayAccountDetails();
        System.out.println("Interest : " + sa.calculateInterest());

        System.out.println();

        CurrentAccount ca = new CurrentAccount();
        ca.setAccountNumber("CA101");
        ca.setHolderName("Rahul Verma");
        ca.setBalance(40000);
        ca.setMonthlyBonusRate(2);

        ca.deposit(5000);
        ca.withdraw(3000);

        System.out.println("Current Account");
        ca.displayAccountDetails();
        System.out.println("Interest : " + ca.calculateInterest());
    }
}