package day47_Abstraction.Employee;

public class Tester extends Employee{

    public Tester(String name, int age, char gender,double salary){
        super(name,age,gender,salary);
    }
    public void work(){
        System.out.println(name + " is working");
    }
    public String toString(){
        return "Name: " + name + ", age: " + age + ", salary: "+ salary+ ", gender: " + gender;


    }
}
