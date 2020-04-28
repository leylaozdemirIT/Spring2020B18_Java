package day13_StringClass;

/*
    input: cyBerTek sChooL
    output:
        Cybertek
        School
 */

import java.util.Scanner;

public class StringManipulations_Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();  // cybertek school

        String firstName = fullName.substring(0,  fullName.indexOf(" ") );
        String lastName = fullName.substring(fullName.indexOf(" ")+1    ); // School
        //cYbeRTEK

        firstName = firstName.substring(0,1).toUpperCase() +  firstName.substring(1).toLowerCase();

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println("Your first name is "+firstName);
        System.out.println("Your last name is "+lastName);



        /*
        Assignment:
            write me a program that asks the user first and last names, then prints the initials.
            ex:
                input:
                    cybertek
                    school
                output:
                    CS
         */
        System.out.println("Enter your first name");
        String firstname= input.next();
        firstname = firstName.toUpperCase();

        System.out.println("Enter your last name");
        String lastname = input.next();
        lastname = lastname.toUpperCase();

       // String initials = firstname.substring(0,1).concat(lastname.substring(0,1));
        String initials = ""+ firstname.charAt(0)+lastname.charAt(0); // both methods work
        System.out.println(initials);





    }



}