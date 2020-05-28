package day41_Inheritance.Task02;

public class BankAccount {

    public long accountNumber;
    public String accountHolder;
    public double balance;

    public void deposit(int amount){
        balance += amount;
    }
    public void showBalance(){
        System.out.println("Available balance: " + balance);
    }
    public String toString(){
        return "Name is: "+accountHolder+", balance: "+balance;
    }
}
