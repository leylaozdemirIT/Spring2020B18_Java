package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class ArraysUtility {
    /*
    Arrays.sort (): sorts in ascending order
    Arrays.equal (): checks if the two arrays are equal or not
    Arrays.toString ():converts single dimensional array to String
    Arrays.deepToString ():converts multi dimensional array to String
     */

    public static void main(String[] args) {
        int [] arr = {9,10,8,65,8,6,5};

        System.out.println( Arrays.toString( arr) );

        Arrays.sort( arr ); //

        System.out.println( Arrays.toString( arr ) );

        int [] salaries = { 100000, 200000, 30, 5000, 432, 123123, 2000000 };
        int length = salaries.length;
        int lastIndex = length-1;

        Arrays.sort( salaries ); // ascending

        System.out.println( Arrays.toString( salaries ) );

        System.out.println( "Minimum salary: " + salaries[0]);
        System.out.println("Maximum salary: " + salaries [lastIndex] );

        System.out.println("=================================");

        int [] arr1= {3,2,1};
        int [] arr2= {2,1,3};

        Arrays.sort( arr1 ); // {1,2,3}
        Arrays.sort( arr2 ); // {1,2,3}

        System.out.println( Arrays.equals(arr1, arr2) );

    }
}
