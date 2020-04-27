package day07_IfStatements;

public class If_Else_Statements {
    public static void main(String[] args) {

        int number = 100;

        /*if (number %2 == 0){
            System.out.println(number + " is even number");
        }

        if (number %2 != 0){
            System.out.println(number + " is odd number");
        }*/

        boolean evenNumber = number %2 == 0;

        if (evenNumber){
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }

        System.out.println("=============================================");

        int age = 30;
        boolean ageEligible = age > 21;

        if (ageEligible){
            System.out.println("Here is your Vodka");
        } else {
            System.out.println("Here is your milk");
        }

        System.out.println("===================================================");

        boolean TestedPositiveForCorona = false;

        if (TestedPositiveForCorona){
            System.out.println("Buy more toilet papers and stay home");
        } else {
            System.out.println("Do more coding");
        }








    }
}
