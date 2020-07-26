package day46_final_abstract;

public class final_variables {

    final int InstanceVariable = 300;
    final int InstanceVariable2 = 400;
    // final instance variables need to be initialized immidiately

    final static int staticVariables = 1000;

    final static int getStaticVariables2 = 100; // final static variables need to be initialized immidiately

    public static void main(String[] args) {
        final double PI = 3.14;
        // PI = 3.15;
        final String gender = "Female";
        // gender = "Female"

        final int score;
        score = 100; // we can only initialize ONLY one time
        // score = 101;
        System.out.println(score);

        System.out.println("===========================");

        final_variables fb1= new final_variables();
        // fb1.InstanceVariable = 400;

        // staticVariables = 2000;
    }
}
