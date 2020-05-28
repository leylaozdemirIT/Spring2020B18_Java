package day42_Inheritance.Task01;
/*
create objects of employee and set their info
create an array of employees and store all those employee objects
use regular for loop to print out each employee' name and employeeID
 */
public class Company { // this is also HAS A relation.We did not inherit any class

    public static Employee employee1 = new Employee();
    public static Employee employee2 = new Employee();
    public static Employee employee3 = new Employee();

    static {
        employee1.setEmployeeInfo("Messi", 32, 'M', 140000, 13654, "SDET");

        employee2.setEmployeeInfo("Aigerim", 18, 'F', 130000, 65654, "QA");

        employee3.setEmployeeInfo("Safar", 25, 'M', 128000, 6599, "BA");

    }
        public static void main(String[] args){
            // FIRST SOLUTION - LEYLA DID

        /*
        Employee employee1 = new Employee();
        employee1.setEmployeeInfo("Zareen",32,'F',120000,123,"SDET");
        Employee employee2 = new Employee();
        employee2.setEmployeeInfo("Nurefsan",25,'F',110000,456,"Developer");
        Employee employee3 = new Employee();
        employee3.setEmployeeInfo("Mustafa",45,'M',130000,789,"SDET");

        Employee [] all = {employee1,employee2,employee3};

        for (int i=0; i<all.length; i++){
            System.out.println(all[i].name + all[i].employeeID);
        }
         */

            // SECOND SOLUTION - MUHTAR DID
            Employee [] employees = {employee2,employee1,employee3};

        for (int i=0; i < employees.length; i++){
            System.out.println("Name: "+ employees[i].name +", ID: "+ employees[i].employeeID );
        }

        }}

