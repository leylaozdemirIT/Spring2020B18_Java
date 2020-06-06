package OfficeHours.Practice_06_03_2020;

import day15_ForLoop.Reverse;

import java.util.ArrayList;
import java.util.Arrays;

/*Create a method that will accept an int array and reverse the order of elements. Return the reversed array.
Overload the method to accept an ArrayList of integers and reverse the order of the elements. Return the reversed ArrayList
*/
public class ReverseElements {
    public static void main(String[] args) {
        int []arr = {5,10,1,7};
        System.out.println(Arrays.toString(ReverseArray(arr)));

        System.out.println("====================================");

        System.out.println(Arrays.toString(reverse(arr)));

    }
    public static int[] ReverseArray(int[]arr){
       int [] reverse = new int[arr.length];

       int j = 0;
       for (int i=arr.length-1; i>=0; i--){
           reverse[j] = arr[i];
           j++;
       }
       return reverse;
    }
    public static int [] reverse(int []arr){

        for (int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i]= temp;
        }
        return arr;
    }




    public static ArrayList<Integer> ReverseArray(ArrayList<Integer> list){
        ArrayList<Integer> reversedArrayList = new ArrayList<>();

        for (int i=list.size(); i>=0; i--){
            reversedArrayList.add(list.get(i));
        }
        return reversedArrayList;
    }
}
