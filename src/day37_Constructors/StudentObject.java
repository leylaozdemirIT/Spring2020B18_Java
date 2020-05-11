package day37_Constructors;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("Marina",34,'F',"Cybertek University");
       //  student1.SetInfo("Marina",34,'F',"Cybertek University");

        System.out.println(student1);

        Student student2 = new Student("Leyla",45,'F',"Cybertek University");

        System.out.println(student2);
    }


}
