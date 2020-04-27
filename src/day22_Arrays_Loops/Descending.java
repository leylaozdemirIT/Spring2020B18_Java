package day22_Arrays_Loops;

import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
        // sort the array in ascending
        // reverse the array that's sorted in ascending to descending

        int[] arr = {10, 78, 2, -1, 500, 70};
        Arrays.sort(arr); //sorts in ascending

        System.out.println(Arrays.toString(arr));

        int[] RevArr = new int[arr.length];

        int j = arr.length - 1;
        for (int i = 0; i <= arr.length-1; i++) {
            RevArr[i] = arr[j];
            j--;
        }
        System.out.println( Arrays.toString( RevArr) );
    }
}
