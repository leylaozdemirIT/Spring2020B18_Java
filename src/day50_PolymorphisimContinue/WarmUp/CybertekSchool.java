package day50_PolymorphisimContinue.WarmUp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CybertekSchool {
    public static void main(String[] args) {
        Student student1 = new Student("Leyla",45,8,false);
        Student student2 = new Student("Zarina",25,5.5,false);
        Student student3 = new Student("Madina",25,7.5,false);
        Student student4=new Student("Ibrahim",26,92,true);
        Student student5=new Student("Canan",25,89,true);

        ArrayList<Student> classmates = new ArrayList<>(Arrays.asList(student1,student2,student3,student4,student5));
        for(int i=0; i<classmates.size();i++){
            System.out.println(classmates.get(i));
        }
    }
}
