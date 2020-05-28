package day37_Constructors__repeat;

public class Student {

    String name;
    int age;
    char gender;
    String university;

    public Student(String name, int age, char gender, String university){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.university = university;
    }

    public void setInfo(String name, int age, char gender, String university){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.university = university;
    }
    public String toString(){
        return "Name: "+name+" Age: "+age+" Gender: "+gender+" University: "+university;
    }
}
