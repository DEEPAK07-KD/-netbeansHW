
package bank;

public class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;
    //CONSTRUCTOR
    public BankAccount(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposite(double amount)
    {
        
        balance=amount+balance;
        System.out.println(amount);
    }
    public void withdraw(double amount)
    {
        
        
        if(balance>amount)
        {
           balance-=amount;
            System.out.println(with);
        }
    }
    public void displayAccountDetails()
    {
        System.out.println("ACCOUNT NUMBER :"+" "+this.accountNumber);
        System.out.println("ACCOUNT HOLDER NAME :"+" "+this.accountHolderName);
        System.out.println("BALANCE :"+" "+this.balance);
    }
}
