
package day33_CustomClass;

public class BankAccount {
    /*
    practice task:
    create a custom class for bank account
      attributes: accountholder, accountnumber, balance
      actions: cehckingBalance(), withDraw( amount ), deposit( amount )
     */

    String accountHolder;
    long accountNumber;
    double balance;

    public void checkingBalance(){
        System.out.println("Available Balance: "+balance);
        if(balance<=0){
            System.out.println("There is no available balance");
            System.exit(0);
        }
    }


    public void withDraw(double amount) {
        if (amount > balance) {
            balance -= amount;
            balance -= 35;
            System.out.println("Your penalty fee is: $ 35");
        } else {
            System.out.println("Withdrawing $" + amount);
            balance -= amount;
        }


    }

    public void deposit(double amount){
        System.out.println("Depositing $"+amount);
        balance += amount;
    }


    public String toString(){
        String result = "Account Holder: "+accountHolder+"\nAccount Number: "+accountNumber+"\nAvilable Balance: "+balance;
        return result;
    }



}
