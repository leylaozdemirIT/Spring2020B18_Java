package OfficeHours.Practice_05_06_2020;
/*
create a class called Developers
Attributes:
        name, employeeId, JobTitle, Salary
        Actions:
        setDeveloperInfo(), coding(), fixingBugs()
 */

public class Developer {

    String name;
    String jobTitle;
    double salary;
    long employeeId;

    public void setInfo(String name, String jobTitle, double salary, long employeeId){
        this.name = name; // user given argument will be assigned to instance variable name
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeId = employeeId;
    }
    public String toString (){
        return "Name "+name+ ", Job Title: "+jobTitle+ " Salary $ "+salary + ", ID "+employeeId;
    }
    public void coding(){
        System.out.println(name + " is coding");
    }
    public void fixingBug(){
        System.out.println(name + " is crying");
    }


}
