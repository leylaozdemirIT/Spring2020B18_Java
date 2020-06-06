package Interview_Questions.Array;

import java.util.Arrays;

/*
Write a method that can concate two arrays
 */
public class ConcatTwoArrays {
    public static void main(String[] args) {
        int[]arr1 = {5,6,7};
        int[]arr2 = {1,2,3};
        int [] arrLast = concatTwoArray(arr1, arr2);
        System.out.println(Arrays.toString(arrLast));


        System.out.println("==================================");

        CombineTwoArray(arr1, arr2);

    }
    public static int[] concatTwoArray(int[]arr1, int[]arr2){
        int[]total = new int[arr1.length + arr2.length];

        int i=0;
        for(int each: arr1) {
            total[i] = each;
            i++;
        }

        for (int each2 : arr2){
            total[i] = each2;
            i++;
        }

        return total;
    }
    public static void CombineTwoArray(int[]r1, int[]r2){
        int [] arr3 = new int[r1.length + r2.length];
    for (int i = 0; i<r1.length; i++){
        arr3[i] = r1[i];
    }
        for (int i= 0; i<r2.length; i++){
        arr3[r1.length + i] = r2[i];
    }

        System.out.println(Arrays.toString(arr3));
}
}
