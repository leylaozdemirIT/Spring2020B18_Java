package day42_Inheritance.Task01;
/*
create a subclass of Person called Student
attributes: name, age, gender, studentID, clazz
        methods: attendClass, code, setStudentInfo, toString
 */


public class Student extends Person{

    /*
    name (Inherited)
    age (Inherited)
    gender (Inherited)
    studentID
    clazz

    attendClass()
    code()
    setStudentInfo()
    toString()
     */
    public long studentID;
    public String clazz;
    static String schoolName = "Cybertek University";

    public void attendClass(){
        System.out.println(name + " is attending class");
    }
    public void code(){
        System.out.println(name + " is coding");
    }
    public void setStudentInfo(String leyla, int i, char f, long studentID, String clazz){
        setPersonInfo(name,age,gender);
        this.studentID = studentID;
        this.clazz = clazz;
    }
    public String toString(){
        return "Name: "+name+", ID: "+studentID+",  age: "+age+", gender: "+gender+", class: "+clazz+
                ", School Name: "+schoolName;
    }
}
