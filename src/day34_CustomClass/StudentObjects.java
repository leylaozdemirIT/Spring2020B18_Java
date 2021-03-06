package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setStudentInfo("Yasmin","Turkish",17,4,'M',false);

        Student student2 = new Student();
        student2.setStudentInfo("Mike","German",30,3.0,'M',false);

        Student student3 = new Student();
        student3.setStudentInfo("Johnny Guitar","US",40,4,'M',false);

        Student student4= new Student();
        student4.setStudentInfo("Anna", "Ukranian", 33,3.9,'F', true);

        Student [] students = {student1,student2,student3,student4};

        ArrayList<Student> canGraduate = new ArrayList<>( Arrays.asList(students) );

        canGraduate.removeIf(s->s.gpa <= 3.0);

        System.out.println(canGraduate.size());

        for (int i=0; i<canGraduate.size(); i++){
            Student each = canGraduate.get(i);
            System.out.println(each.name + " can graduate");
        }

        System.out.println("============================");

        ArrayList<Student> canNotGraduate = new ArrayList<>( Arrays.asList(students) );
        canNotGraduate.removeIf(p-> p.gpa>3.0);

        System.out.println( canNotGraduate.size() );

        for (Student each : canNotGraduate){
            System.out.println(each.name + " can NOT graduate");
        }








    }
}
