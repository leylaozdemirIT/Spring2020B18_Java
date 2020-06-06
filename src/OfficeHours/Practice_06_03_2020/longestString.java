package OfficeHours.Practice_06_03_2020;
/*
Create a method that will accept an ArrayList of Strings and return the String that has the biggest length
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class longestString {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("car", "house","java","thisisreallybig","mark", "", "morewords")) ;

        System.out.println(longestString(list));
    }

    public static String longestString(ArrayList<String> list) {

        String biggest = "";

        for(String word : list) {

            if(word.length() > biggest.length()){
                biggest = word;
            }

        }
        return biggest;

    }


}