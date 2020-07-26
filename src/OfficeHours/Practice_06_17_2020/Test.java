package OfficeHours.Practice_06_17_2020;

import day22_Arrays_Loops.Scanner_Arrays;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            String s = "abc";
            System.out.println(s.charAt(3));
            int [] a = new int[3];
            System.out.println(a[50]);

            // Exception obj = new RuntimeException();

        } catch (StringIndexOutOfBoundsException e){
            System.out.println("out of bounds");
        } catch(Exception e){
            System.out.println("general exception");
        } finally{
            input.close();
            System.out.println("finally block");
        }
    }
}
