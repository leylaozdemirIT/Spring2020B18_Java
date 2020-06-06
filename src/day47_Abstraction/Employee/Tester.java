package day47_Abstraction.Employee;

public class Tester extends Employee{

    public Tester(String name, int age, char gender,double salary){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }
    public void work(){
        System.out.println(name + " is working");
    }
    public String toString(){
        return "Name: " + name + ", age: " + age + ", salary: "+ salary+ ", gender: " + gender;


    }
}
