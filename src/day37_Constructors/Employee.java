package day37_Constructors;

public class Employee {
   /*
   Create a class called Employee

			instance variables:
					name, id, ssn, jobTitle, salary, gender
			actions:
					setEmployeeInfo(): can initialize all the instance variables
					toString(): can return the info of the employee as string

    */
    String name;
    long id;
    long ssn;
    String jobTitle;
    double salary;
    char gender;

    public void setInfo(String name, long id, long ssn, String jobTitle, double salary, char gender){
        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
    }

    public String toString(){
        return "Name "+name+" ID number is: "
                +id+" Social Number is: "+ssn
                +" Job Title is: "+jobTitle
                +" Salary: "+salary
                +" Gender: "+gender;
    }



}
