package day12_JavaRecap;

import java.util.Scanner;

public class SalaryReport {
    /* ask the user enter salary
    ask the user enter full name
    ask the user to enter company name
    ask the user to enter SSN
    ask the user to enter job title
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();

        input.nextLine(); // we took out enter

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your company name: ");
        String companyName = input.nextLine();

        System.out.println("Enter your SSN: ");
        long ssn = input.nextLong();

        input.nextLine();

        System.out.println("Enter your job title: ");
        String jobtitle = input.nextLine();

        System.out.println("Full name is: "+ fullName);
        System.out.println("Job title is: " + jobtitle);
        System.out.println("Company name is: " + companyName);
        System.out.println("SSN: " + ssn);
        System.out.println("Salary is: $ " + salary);







    }
}
