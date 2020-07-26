package day47_Abstraction.Employee;

public abstract class Employee {

    String name;
    int age;
    char gender;
    double salary;

    public Employee(String name, int age, char gender,double salary){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.salary=salary;
    }

    public abstract void work();

    public abstract String toString();
}
