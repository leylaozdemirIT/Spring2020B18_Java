package day37_Constructors;

/*
create class called BankOfAzerbaijan
1. create a List of Employees
2. add random two employees from HumanResources to the List
3. use for each loop to print out the employee info
4. now go back to HumanResources class and comment out the static block
5. repeat the step 3 to print out the employee info to compare it with previous output
 */


import java.util.ArrayList;

public class BankOfAzerbaijan {

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add( HumanResources.employee3 ); // index 0
        list.add( HumanResources.employee1);  // index 1

        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
    }




}
