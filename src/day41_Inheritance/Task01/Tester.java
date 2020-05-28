package day41_Inheritance.Task01;

public class Tester extends Employee {

    /*
    name (Inherited)
    salary (Inherited)
    id (Inherited)
    jobTitle (inherited)
    gender (inherited)

    reporting()
    testing ()
     */

    public Tester(String name, double salary, long id, String jobTitle, char gender){
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }


    public void reporting(){
        System.out.println(name + " is reporting Bug");
    }
    public void testing(){
        System.out.println(name + " is testing");
    }
}
