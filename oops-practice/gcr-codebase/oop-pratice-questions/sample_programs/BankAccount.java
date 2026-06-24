public class BankAccount{

    String accountHoldername;
    final int accountNumber;
    static String bankName="bank Of Baroda";
    static int totalaccounts=0;

    BankAccount(String accountHoldername,int accountNumber)
    {
        this.accountHoldername=accountHoldername;
        this.accountNumber=accountNumber;

        totalaccounts++;
    }
    static int gettotalaccounts()
    {
        return totalaccounts;
    }

     void displayDetails() {
        System.out.println("Account Holder Name : " + accountHoldername);
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Bank Name           : " + bankName);
    }

    public static void main(String args[])
    {
        BankAccount acc1=new BankAccount("Rishav sharma", 123456);
        
        if (acc1 instanceof BankAccount) {
            acc1.displayDetails();
        }

        System.out.println("the total number of accounts are : "+gettotalaccounts());
    }
}
