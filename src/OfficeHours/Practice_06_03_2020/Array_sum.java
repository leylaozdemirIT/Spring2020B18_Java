package OfficeHours.Practice_06_03_2020;
/*

 1) Create a method that will accept an int array and return the sum of all the numbers in the given array
2) Overload the method to accept an ArrayList of integers and return the sum of all the numbers in the given ArrayList


 */

import java.util.ArrayList;
import java.util.Arrays;

public class Array_sum {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40));

        System.out.println(sumAll(arr));
        System.out.println(sumAll(list));
    }
    public static int sumAll(int[]arr){
        int sum = 0;
        for (int each : arr){
            sum+=each;
        }
        return sum;
    }
    public static int sumAll(ArrayList<Integer>list){
        int sum2 = 0;
        for (int i=0; i<list.size(); i++){
            sum2 += list.get(i);
        }
        return sum2;
    }
}
