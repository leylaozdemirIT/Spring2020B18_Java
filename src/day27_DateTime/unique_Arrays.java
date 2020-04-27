package day27_DateTime;
/*
write a method that can print out the unique elements from an int array
        {6,6,7,7,8,9} ==> 8 9
 */

public class unique_Arrays {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 4, 3, 3}; // 2

        // for (int each2 : arr) { // can be done with another each loop or regular for loop

        for (int i=0; i<arr.length; i++){

            int count = 0;
            for (int each : arr) {
                if (each == arr[i]) { // if you with each loop. you write each2 instead of arr[i]
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(arr[i]);// if you with each loop. you write each2 instead of arr[i]
            }
        }
        System.out.println("===========================");
        int [] arr2 = {3,3,4,4,5,6,7,8,9};
        uniqueElements(arr2);

        System.out.println("============================");
        double [] arr3 = {1.5, 2.5, 3.5};
        uniqueElements(arr3);
    }

    public static void uniqueElements(int []arr){
        for(int each2: arr){

            int count = 0 ;
            for(int each   :  arr){
                if(each == each2 ){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(each2);
            }
        }
    }

    public static void uniqueElements (double [] arr){

        for(double each2: arr){

            int count = 0 ;
            for(double each   :  arr){
                if(each == each2 ){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(each2);
            }
        }
    }
}
