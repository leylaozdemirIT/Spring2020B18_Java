package Interview_Questions.Array;

import java.util.Arrays;

public class ReverseArray_Saim_Muhtar {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4}; // 0 2 3 4 // 4 0 3 1 // 4 3 3 1 / 4 3 2 1
        int [] reversed = new int[arr.length];

        /*
        int j=0;
        for (int i=arr.length-1; i>=0; i--){
            reversed[j] = arr[i];
            j++;
        }
         */
        for (int i=0; i < arr.length/2; i++){
            int temp = arr[i]; // 1 2
            arr[i] = arr[arr.length-1 - i];
            arr[arr.length-1-i] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
