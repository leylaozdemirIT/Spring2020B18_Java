package day19_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Practice2 {

    public static void main(String[] args) {
            int[] arr = {10, 20, 30};

            System.out.println( arr.length ); // 3

            int[] arr2 = new int[5];

            System.out.println(arr2[0]);
            System.out.println(arr2[1]);


            String[] Testers = new String[3];  // {"Reem", "Madina", "Osman"};
            // index: 0, 1, 2

            Testers[0] = "Reem";
            Testers[2] = "Osman";
            Testers[1] = "Madina";
            System.out.println(Testers[0]);  // Reem
            System.out.println(Testers[1]); // null
            System.out.println(Testers[2]); // "Osman

            System.out.println(Testers.length);  // 3

            System.out.println("========================================");

            String [] students = new String [10];

            for (int i=0; i<students.length; i++){
                Scanner input = new Scanner (System.in);
                System.out.println ("Please write a name");
                students [i] = input.next();

            }
            System.out.println(Arrays.toString(students));

            }

    }