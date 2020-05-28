package day37_Constructors__repeat;

public class StudentObject {

    public static void main(String[] args) {

       Student student1 = new Student("Marina",34,'F',"Cybertek University"); //Constructor
       student1.setInfo("Marina",34,'F',"Cybertek University"); // instance method
        // both are same, but 1st step is quicker and in 1 step

        System.out.println(student1);

        Student student2 = new Student("Leyla",45,'F',"Cybertek University");//constructor

        System.out.println(student2);
    }


}
