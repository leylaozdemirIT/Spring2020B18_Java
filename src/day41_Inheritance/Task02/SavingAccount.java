package day41_Inheritance.Task02;

public class SavingAccount extends BankAccount{
    /*
        accountNumber (Inherited)
        accountHolder (Inherited)
        balance (Inherited)

        interestRate

        deposit (Inherited)
        showBalance (Inherited)
        toString (Inherited)
     */
    public static double interestRate;

    static{
        interestRate = 0.02;
    }
}
