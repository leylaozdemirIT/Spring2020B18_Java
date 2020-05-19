package day24_Methods__repeat;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {

    }

    public static String Reverse2(String str) {
        String Reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            Reverse += str.charAt(i);
        }
        return Reverse;
    }

    public static int[] sortDescending(int[] arr) {
        Arrays.sort(arr);

        int[] RevArr = new int[arr.length];

        int j = arr.length - 1;
        for (int i = 0; i <= arr.length - 1; i++) {
            RevArr[i] = arr[j];
            j--;
        }
        return RevArr;
    }

    // remove duplicates from string
    // Frequency of string
    // merge two array and return third one
    // max number from array
}

