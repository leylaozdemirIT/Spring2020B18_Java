package day41_Inheritance.Task02;

public class checkingAccount extends BankAccount{

    /*
    accountNumber (Inherited)
    accountHolder (Inherited)
    balance (Inherited)

    deposit (Inherited)
    withDraw (declared)
    showBalance (Inherited)
    toString (Inherited)
     */

    public void withDraw(int amount){
        balance -= amount;
    }

}
