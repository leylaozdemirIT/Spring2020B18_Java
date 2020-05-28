package day41_Inheritance.Task02;

public class AccountObjects {

    public static void main(String[] args) {

        checkingAccount obj = new checkingAccount();
        obj.accountHolder = "Saban";

        obj.showBalance();
        System.out.println(obj);

        obj.deposit(2000);
        obj.showBalance();

        obj.withDraw(10000);
        obj.showBalance();

        System.out.println(obj);

        System.out.println("==================================");

        SavingAccount saving = new SavingAccount();

        System.out.println(SavingAccount.interestRate);

        System.out.println( saving );

        saving.deposit(3000);
        saving.showBalance();

        // saving.withDraw()


    }
}
