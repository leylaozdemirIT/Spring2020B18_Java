package day20_ArraysContinue;

import java.util.Scanner;

// write a program that asks "enter a name" 10 times, and store each of the names in the array students
public class Task {
    public static void main(String[] args) {
        Scanner name = new Scanner (System.in);
        String[] students = new String[10];


    for (int i=0; i < 10; i++){
        System.out.println("Enter a name");
        students [i] = name.nextLine();

    }
        System.out.println( students[0] );
        System.out.println(students[1]);
        System.out.println( students[2] );
        System.out.println( students[3] );
        System.out.println( students[4] );
        System.out.println( students[5] );
        System.out.println( students[6] );
        System.out.println( students[7] );
        System.out.println( students[8] );
        System.out.println( students[9] );
    }
}
