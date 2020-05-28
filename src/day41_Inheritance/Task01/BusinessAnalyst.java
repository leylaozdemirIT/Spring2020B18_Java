package day41_Inheritance.Task01;

public class BusinessAnalyst extends Employee {
    /*
    salary
    name
    id
    jobTitle
    gender

    writingReq()
    gathering()
    toString()
     */

    public BusinessAnalyst(String name,double salary,long id,char gender){
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.jobTitle = "Business Analyst";
        this.gender = gender;
    }
    public void writingRequirements(){
        System.out.println(name + " is writing requirements");
    }
    public void gathering(){
        System.out.println(name + " is gathering");
    }

}
