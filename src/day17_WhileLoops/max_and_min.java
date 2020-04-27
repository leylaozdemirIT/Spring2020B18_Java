package day17_WhileLoops;
/*write a program that can ask the user "enter a number" five times
and return the maximum number
        hint: you will need for loop and if statement*/

import java.util.Scanner;

public class max_and_min {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
     int maxNumber = -999999999; // any number the user provided will be greater than this number
        // first user entered variable will be initialized to maxNumber
     int minNumber = 999999999;

    for (int i = 1 ; i <= 5 ; i++) {
        System.out.println("Enter a number");
        int num = input.nextInt();

        if (num > maxNumber) {
            maxNumber = num;
        }
        if (num < minNumber){
            minNumber = num;
        }
    }
        System.out.println("Maximum number is: " + maxNumber);
        System.out.println("Minimum number is: " + minNumber);

        }
    }
