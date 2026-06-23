public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String accountHolder,int accountNumber,double balance)
    {
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    void deposit(double money)
    {
        if(money<=0)
        {
            System.out.println("Invalid Amount");
            return;
        }
        balance+=money;
        System.out.println("Amount added successfully");
    }

    void withdrawal(double money)
    {
        if(money <= 0)
        {
        System.out.println("Invalid Amount");
        }
        else if(money>balance)
            System.out.println("Insufficient Balance");
        else{
        balance-=money;
        System.out.println("Amount Withdrawal Successfully");
        }
    }

    void displaybalance()
    {
        System.out.println("Remaining Balnce: "+balance);
    }

    public static void main(String args[])
    {
        BankAccount acc1=new BankAccount("Harshit", 123456789, 1000.0);
        BankAccount acc2=new BankAccount("Arpit", 987654321, 1000.0);
        acc1.deposit(500.0);
        acc2.withdrawal(500.0);
        acc1.displaybalance();
        acc2.displaybalance();
    }
}
