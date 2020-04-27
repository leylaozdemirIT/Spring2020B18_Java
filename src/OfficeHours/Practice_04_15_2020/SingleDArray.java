package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class SingleDArray {
    public static void main(String[] args) {
        int a = 100;
        int [] arr = {100,200,300};
        //              0   1   2

        System.out.println( arr [1]);

        for (int i=0; i<= arr.length-1; i++){
            // System.out.println( arr[i] );
            int num = arr[i];
            System.out.println(num);
        }
        System.out.println("==============================");
        int j = 0;
        while (j<=arr.length-1){
            int num = arr[j];
            System.out.println(num);
            j++;
        }
        System.out.println("==============================");

        String [] names = {"John", "Aaron", "Louise"}; //3
                        //   0        1         2
        int length = names.length; // 3
        String [] reverse = new String [length]; // {null, null, null}
        /*      i           k
        reverse [0] = names [2];
        reverse [1] = names [1];
        reverse [2] = names [0];*/

        System.out.println( Arrays.toString(reverse));

        System.out.println("====================================");
        int k = length-1; // we can write 2 also
        for (int i=0; i< length; i++){
            reverse [i] = names [k];
            k--;
        }
        System.out.println( Arrays.toString(reverse) );
        System.out.println("=========================================");
        int i=0;
        int l=length-1;
        while (i<length){

            reverse[i] = names[l];
            i++;
            l--;

        }


        System.out.println( Arrays.toString( reverse) );
    }
}
