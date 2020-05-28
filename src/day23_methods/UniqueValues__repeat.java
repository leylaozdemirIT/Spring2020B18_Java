package day23_methods;

/*
 1.  Write a program that can print out the unique values from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B
                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C
            MUST use for each loop
 */

public class UniqueValues__repeat {

    public static void main(String[] args) {

        String[] arr = {"A", "B", "A", "C", "D"};  // B C D
        //       0    1    2

        for (int j=0; j<=arr.length-1; j++){
        int count = 0;
        for (int i=0; i<=arr.length-1; i++){
            if (arr[i] == arr[j]){
                count++;
            }
        }
            if (count == 1){
            System.out.println(arr[j]);
        }

        }


        System.out.println("=============================================");

        // solution2:

        for( String each2 : arr ){ // 3: A,

            int count2 = 0;
            for( String each : arr ){
                if(each.equals(each2)){
                    count2++;
                }
            }

            if(count2 == 1){  // if the character is unique
                System.out.println(each2);
            }


        }





/*
String str = "AAABBCC" ==> A3B2C2

str.toCharArray(); // [A,A,A,B,B,C,C]


 */
    }
}