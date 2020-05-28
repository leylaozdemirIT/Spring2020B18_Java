package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

public class School { // School has a Student. This is HAS A relation.
    // we did not inherit. Just created objects from Student class

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentInfo("Leyla",45,'F',123,"Batch 18");

        Student student2 = new Student();
        student2.setStudentInfo("Bahtiyar",32,'F',2378,"art");

        Student student3 = new Student();
        student3.setStudentInfo("Bykal",10,'M',2309,"soccer");

        ArrayList<Student> students = new ArrayList(Arrays.asList(student1,student2,student3));

        for (Student eachStudent : students){
            System.out.println(eachStudent);
            System.out.println("name: "+eachStudent.name+", ID: "+eachStudent.studentID);
        }

    }

}
