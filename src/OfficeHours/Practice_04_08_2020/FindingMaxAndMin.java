package OfficeHours.Practice_04_08_2020;

import java.util.Scanner;

public class FindingMaxAndMin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = -214748367;
        int min = 214748367;


        int i = 1;
        while (i <= 5) {

        System.out.println("Enter a number");
        int num = input.nextInt();

        if (num > max) { // whichever user input is greater, will be assigned to max
                max = num;
        }

        if (num < min) { //whichever user input is smaller, will be assigned to min
                min = num;
        }
            i++;
        }
        System.out.println("maximum number is: " + max);
        System.out.println("minimum number is: " + min);
    }
}
