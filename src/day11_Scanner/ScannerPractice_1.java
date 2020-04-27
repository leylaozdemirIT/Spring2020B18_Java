package day11_Scanner;

import java.util.Scanner;
/*
        1. ask the user enter first name
        2. ask user to enter last name
        3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
        4. if he is employeed , ask the salary
        4. if he is not employeed set the salary to 0

        output:
        full name:
        employeeed status:
        salary:*/
public class ScannerPractice_1 {

    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);

        System.out.println("Enter your first name: ");
        String name = input.next();
        System.out.println("Enter your last name: ");
        String lastname = input.next();

        String fullName = name + " " + lastname;
        System.out.println("Full name is: " + fullName);

        System.out.println("Are you employed?");
        boolean employmentStatus = input.nextBoolean();

        double salary = 0;
        if (employmentStatus == true){
            System.out.println("Enter your salary: ");
            salary = input.nextDouble();
        }else { // this is not needed, but you can still write it
            salary = 0;
        }

        System.out.println("Employed " + employmentStatus);
        System.out.println("Salary: $ " + salary);

    }
}
