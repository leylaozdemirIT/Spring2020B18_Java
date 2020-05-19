package day41_Inheritance.Task01;

import day41_Inheritance.Task01.Employee;
/*
create a subclass of employee name it developer
variables: salary, name, id, jobTitle, gender,
action: fixingBug, coding

create a constructor that can initialize all the attributes
 */
public class Developer extends Employee {
    /*
    name (Inherited)
    salary (Inherited)
    id (Inherited)
    jobTitle (Inherited)
    gender (Inherited)

    fixingBug()

     */


    public Developer(String name, String jobTitle, char gender, double salary, long id){
        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.salary = salary;
        this.id = id;
    }

    public void fixingBug(){
        System.out.println(name + " is fixing bug");
    }
    public void coding(){
        System.out.println(name + " is coding");
    }
}
