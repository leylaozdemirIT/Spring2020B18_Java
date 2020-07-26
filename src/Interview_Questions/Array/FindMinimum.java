package Interview_Questions.Array;

import java.util.Arrays;

public class FindMinimum {
    public static void main(String[] args) {
        int []arr = {10,20,30,40};
        System.out.println(FindMinimum(arr));

        System.out.println(FindMinimum2(arr));
    }
    public static int FindMinimum(int []arr){
        int min = Integer.MAX_VALUE; // 123456789

        for (int i=0; i<arr.length; i++){
            if (arr[i] < min){      // 10 < 123456789
                min = arr[i];       // 10
            }
        }
        return min;
    }
    public static int FindMinimum2 (int [] arr){

        Arrays.sort(arr);
        return arr[0];
    }

}
