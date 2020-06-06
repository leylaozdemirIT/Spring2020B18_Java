package Interview_Questions.Array;

import java.util.Arrays;

public class FindMaximum {

    public static void main(String[] args) {
    int [] arr = {5,8,7,50};
        System.out.println(FindMaximum(arr));
        System.out.println(FindMaximum2(arr));
    }

    public static int FindMaximum(int[]arr){
        // {5,8,7,50}
        int max = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max);
            max = arr[i];
        }
        return max;
    }
    public static int FindMaximum2(int[]arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
