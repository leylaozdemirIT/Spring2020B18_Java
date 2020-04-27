package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class NestedLoops {
    public static void main(String[] args) {
    char [][] arr2D = { {'A', 'B'} , {'C','D','E'} , {'F', 'J', 'H'}};
    //                      0               1               2

        // arr2D[0]
    for (int k=0; k<= arr2D.length-1; k++) {

        for (int i = 0; i <= arr2D[k].length - 1; i++) {
            System.out.println( arr2D[k][i] );
        }
    }
        System.out.println("======================================");
     //   char [][] arr2D = { {'A', 'B'} , {'C','D','E'} , {'F', 'J', 'H'}};
        //                      0               1               2

        for ( char [] each1DArray : arr2D ) {

            for (char eachElement : each1DArray) {
                System.out.println( eachElement );
            }
        }






    }
    }
