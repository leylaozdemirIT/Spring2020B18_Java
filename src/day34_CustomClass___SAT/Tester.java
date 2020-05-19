package day34_CustomClass___SAT;

public class Tester {
    String name;
    long employeeID;
    String JobTitle;
    double salary;
    /*
    Attributes : name, employeeID, Jobtitle, salary
    Actions:
    setTesterInfo(), smokeTesting(),  creatingTicket();*/

    public void setTesterInfo(String name, long employeeID, String JobTitle, double salary){
        this.name = name;
        this.employeeID = employeeID;
        this.JobTitle = JobTitle;
        this.salary = salary;
    }
    public void smokeTesting(String name){
        System.out.println(name + " is doing Smoke Testing");
    }
    public void creatingTicket(String name){
        System.out.println(name + " is creating Ticket");
    }
    public String toString(){
        return "Name: "+name+", job Title: "+JobTitle+
                ", employee id: "+employeeID+" , salary: "+salary;
    }
}
