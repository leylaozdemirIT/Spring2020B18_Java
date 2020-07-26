package Interview_Questions.Array;

import java.util.Arrays;

public class FindMaximum {

    public static void main(String[] args) {
    int [] arr = {5,8,7,50};
        System.out.println(FindMaximum(arr));
        System.out.println(FindMaximum2(arr));
    }

    public static int FindMaximum(int[]arr) {
        // {5,8,7,50}
        int max = Integer.MIN_VALUE; // -1234567
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public static int FindMaximum2(int []arr){
    Arrays.sort(arr);
    return arr[arr.length-1];
    }
}