package day08_IfStatements;

public class EqualNumbers {
/*write a program that can check the equality of the three given numbers
    declare 3 numbers n1, n2, n3
            if n1 and n2 are equal  => n1&n2 are equal
            if n2 and n3 are equal ==> n2&n3 are equal
            if n3 and n1 are equal ==>n3&n1 are equal
            if all equal ==> all equal
            if none of them are equal ==> none of them are equal*/

    public static void main(String[] args) {
        double n1 = 100.5;
        double n2 = 200.5;
        double n3 = 300.5;

        boolean n1Equaln2 = n1 == n2 && n1 != n3; //if n1 equal to n2 and does not equal n3, this makes n1 equal to n2
        boolean n1Equaln3 = n1 == n3 && n1 != n2; // only  n1 = n3 are equal
        boolean n2Equaln3 = n2 == n3 && n2 != n1;
        boolean allEqual = n1 == n2 && n1 == n3; // all of them are equal
        boolean noneEqual = n1 != n2 && n1 != n3 && n2 != n3; // none of them equal
        boolean noneOfThemEqual = n1Equaln2 == false && n1Equaln3 == false && n2Equaln3 == false;
        boolean noneEqual2 = !n1Equaln2 && !n1Equaln3 && !n1Equaln3; // none of them equal


        if (n1Equaln2){ // n1 == n2 && n1 != n3
            System.out.println("n1 is equal to n2");
        }
        if (n1Equaln3){ // n1 == n3 && n1 != n3
            System.out.println("n1 & is equal to n3");
        }
        if (n2Equaln3){ // n2 == n3 && n2 != n1
            System.out.println("n2 is equal to n1");
        }
        if (allEqual){
            System.out.println("n1 is equal to n2 and n3");
        }else
            System.out.println("None of them are equal");


        }
    }

