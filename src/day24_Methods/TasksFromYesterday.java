package day24_Methods;

import java.util.Arrays;

/*
create a function that can print the maximum number from any given array
create a function that can print the minimum number from any given array
create a function that can print out the array in descending order
        [1,2,3] == > [3,2,1]
        */
public class TasksFromYesterday {
    public static void main(String[] args) {

        int[] arr = {5, 80, 70, -50};

        maxNumber(arr);
        minNumber(arr);
        arrDesc(arr);

        System.out.println("=========================");
        int[] arr2 = {100, 20, 30, 40, 40, -100};
        maxNumber(arr2);
        minNumber(arr2);
        arrDesc(arr2);
    }
    public static void maxNumber(int[] array) {

        Arrays.sort(array);
        System.out.println("Maximum number is: " + array[array.length - 1]);

    }

    public static void minNumber(int[] array) {

        Arrays.sort(array);
        System.out.println("Minimum number is: " + array[0]);
    }

    public static void arrDesc(int[] numbers) {

        Arrays.sort(numbers);

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}

