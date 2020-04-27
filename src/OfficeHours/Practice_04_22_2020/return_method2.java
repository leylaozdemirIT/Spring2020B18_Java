package OfficeHours.Practice_04_22_2020;

import java.util.Arrays;

import static java.util.Arrays.*;

public class return_method2 {
// write a return method that can return the second max number from any given int array

    public static void main(String[] args) {
        int[] arr = {100, 40, 500, 50, 30, 100, -5, -100};
        int num2 = SecondMax(arr);
        System.out.println(num2);
    }

    public static int SecondMax(int[] arr) {

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int secondMaximum = arr[arr.length-2];

        return secondMaximum;

        }
}





