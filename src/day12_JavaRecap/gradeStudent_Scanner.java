package day12_JavaRecap;
 /*Write a Java Program that can calculate the garde of a student based on the score,
         implement the following logic:
         If marks < 60, then print "Fail"
        If marks >= 60, but less than 90, then print "Pass"
        If marks >= 90, then print "Passed with Distinction"
        MUST use scanner*/
 import java.util.Scanner;
 public class gradeStudent_Scanner {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Enter your grade");
         byte grade = input.nextByte();

         if (grade >= 0 && grade < 100) {

             if (grade < 60){
                 System.out.println("Fail");
             } else if (grade >= 60 && grade < 90){
                 System.out.println("Pass");
             }else if (grade >= 90){
                 System.out.println("Passed with distinction");
             }
             }else {
             System.out.println("Invalid entry");


         }
     }}
