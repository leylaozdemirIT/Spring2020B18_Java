package day02_Variables;

import java.sql.SQLOutput;

public class EmployeeInfo_Variables {
 /*
 create a class called EmployeeInfo_Variables
declare employeeName, company name, employee id, job title, salary, SSN
  */
    public static void main(String[] args) {

        String employeeName = "Leyla Ozdemir";
        String companyname = "Amazon";
        int EmployeeID = 10;
        String JobTitle = "SDET";
        double Salary = 120000.50;
        long ssn = 123456789;
// Employee Name: Leyla Ozdemir
        /* System.out.println("Employee Name:" + employeeName);
        System.out.println("Company Name: " + companyname);
        System.out.println("Employee ID: " + EmployeeID);
        System.out.println("Job Title: " + JobTitle);
        System.out.println("Salary: " + Salary);
        System.out.println("Social Security Number: " + ssn);

         */
        System.out.println("Employee Name: " + employeeName + "\nCompany Name: "+ companyname +"\nEmployee ID: "
                + EmployeeID + "\nJob title: " + JobTitle + "\nSalary: " + Salary + "\nSocial Security Number: " + ssn);

        System.out.println("==================================================");
        String firstName = "Zeynep";
        String lastName = "Dere";

        System.out.println("Full Name: " + firstName +" " + lastName);








    }
}
