package day41_Inheritance;
/*
public variables:  bankName, firstName, lastName
private variables: accountHolder, accountNumber, balance
        encapsulate all the private data
        (DO NOT USE SHORTCUT)
        create a constructor that can initialize firstName and fullName
        (DO NOT USE SHORTCUT)
        action:
        depositing
        withdrawing
        availablebalance
        toString: returns the full name and balance
 */

public class BankAccount {

    public static String bankname = "Bank of America";
    public String firstName = "";
    public String lastName = "";

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountHolder = firstName + " "+lastName;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(String firstName, String lastName){
        accountHolder = firstName + " "+lastName;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void depositing(int amount){
        // balance += amount;
        setBalance(balance + amount);
    }
    public void withdrawing(int amount){
        // balance -= amount;
        setBalance(balance - amount);
    }
    public void checkBalance(){
        System.out.println("Available balance");
        System.out.println("Available balance is: "+getBalance());
    }

    public String toString(){
        return "Full Name: "+ getAccountHolder()+", Balance: "+getBalance();
    }
}
