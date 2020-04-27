package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Java";

        char [] chars = name.toCharArray();

        System.out.println(chars [0]); // 'J'
        System.out.println(chars [3]); // 'a'

        String str = "I like Java";
        String array [] = str.split(" ");

        System.out.println( Arrays.toString(array) );

        /*
        reverse sentence: day is great Today
         */

        String sentence = "Today is great day";
        String [] words = sentence.split(" ");

        System.out.println( Arrays.toString(words) );
        String result = "";

        for (int i = words.length-1; i>=0; i--){
            String eachwords = words [i];
            // System.out.print (eachwords+ " ");
            result += eachwords+ " ";

        }

        System.out.println(result);

        String string = "ABCD";
        String arr2[] = string.split("");//when we split with empty space, it returns a String

        System.out.println(Arrays.toString(arr2)); //this data type is String
        char [] ch2 = string.toCharArray();
        System.out.println(Arrays.toString(ch2)); // this data type is char







    }
}
