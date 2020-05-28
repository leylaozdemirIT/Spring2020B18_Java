package day42_Inheritance.Task01;
/*
create a sub class of person called Employee
attributes: name, age, gender, Salary, employeeID, jobTitle
        methods: work, setEmployeeInfo, toString
 */


public class Employee extends Person{

    /*
    name (inherited)
    age (inherited)
    gender (inherited)
    Salary
    emloyeeID
    jobTitle

    setPersonInfo() (Inherited)
    eat() (Inherited)
    sleep() (Inherited)
    walk()  (Inherited)
    drink() (Inherited)

    setEmployeeInfo
    work
    toString
     */

    public double salary;
    public long employeeID;
    public String jobTitle;

    public void work(){
        System.out.println(name + " is working");
    }
    public void setEmployeeInfo(String name, int age, char gender, double salary, long employeeID, String jobTitle){
        // this.name = name;
        // this.age = age;
        // this.gender = gender;
        setPersonInfo(name,age,gender); // try to understand this - same as the above 3 lines
        this.salary=salary;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
    }
       public String toString(){
        return "Name: "+name+", Job Title: "+jobTitle+", ID: "+employeeID+", Salary: "+
                salary+", age: "+age+", gender: "+gender;
    }

}
