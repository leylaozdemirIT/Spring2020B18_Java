package day30_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays__DOIT {

    public static void main(String[] args) {
        String [] arr1 = {"A","B","C","D"};
        String [] arr2 = {"D","E","F","G"};

        ArrayList<String> list = new ArrayList<>();

        for (int i=0; i<= arr1.length-1; i++){
            String eachElement = arr1[i];
            list.add(eachElement); // arr1[i];
        }
        for (String eachElement : arr2){
            list.add(eachElement);
        }
        System.out.println(list);
    }

    public static class WrapperClass_Practice___continue {
        public static void main(String[] args) {
            String [] arr = {"1","2.5", "3", "3.5", "4.5"};


            double max = Double.MIN_VALUE;

            for (String each : arr) {
                double num = Double.parseDouble(each);

                if (num > max) {
                    max = num;
                }
            }
            System.out.println(max);

            System.out.println("==========================");
            String [] arr2 = {"1","2.5", "3", "3.5", "4.5"};

            double [] numbers = new double[arr2.length]; // [0.0,0.0,0.0,0.0,0.0]

            // numbers [0] = Double.parseDouble(arr2[0]) ;

            for (int i=0; i<= arr2.length-1; i++){
                numbers[i] = Double.parseDouble(arr2[i]);
            }
            System.out.println(Arrays.toString(numbers));

            Arrays.sort(numbers);

            System.out.println(numbers[numbers.length-1]);






        }




        }
}
