package day47_Abstraction.Employee;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, double salary){
        super(name,age,gender,salary);

    }
    @Override
    public void work() {
        System.out.println(name + " is developing");
    }
    public String toString(){
        return "Name: " + name + ", age: " + age + ", salary: "+ salary+ ", gender: " + gender;
    }
}
