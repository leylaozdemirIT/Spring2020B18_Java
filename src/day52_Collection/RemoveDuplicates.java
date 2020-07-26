package day52_Collection;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
Write a program that can remove duplicates from a string

Write a program that can identify if two strings are built out of same letters
ex: str1 = "abababa" str2 = "ab"  output = true
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "ABABABCDEF"; // "A" "B" "C" "D" "E" "F"
       String[] arr = str.split("");

        System.out.println(Arrays.toString(arr));

        LinkedHashSet<String> ls = new LinkedHashSet<>( Arrays.asList(arr) );

        System.out.println(ls);

        String result = "";

        for (String each: ls){
            result += each;
        }
        System.out.println(result);
        System.out.println("=========================================");
        //SECOND SOLUTION
        String str1 = "ABABABCDEF"; // "A" "B" "C" "D" "E" "F"
        String [] arr1 = str1.split("");
        str1 = "";

        for ( String each : new LinkedHashSet<>( Arrays.asList(arr1)) ){
            str1 += each;
        }

        System.out.println("===============================================");

        // THIRD OPTION
        String str2 = "ABABABCDEF"; // "A" "B" "C" "D" "E" "F"
        String [] arr2 = str2.split("");
        str2 = new LinkedHashSet<>(Arrays.asList(arr2)).toString().replaceAll(", ","");
        System.out.println(str2);

        System.out.println("=======================================");
        String str3 = "abababab";
        String str4 = "baba";

        String [] arr3 = str3.split("");
        String [] arr4 = str4.split("");

        TreeSet<String> t1 = new TreeSet<>(Arrays.asList(arr3));
        TreeSet<String> t2 = new TreeSet<>(Arrays.asList(arr4));

        System.out.println(t1);
        System.out.println(t2);

        str3 = t1.toString();
        str4 = t2.toString();

        System.out.println(str3.equals(str4));

        //SECOND OPTION
        String str5 = "abababab";
        String str6 = "baba";

        str5 = new TreeSet<>(Arrays.asList(str5.split(""))).toString();
        str6 = new TreeSet<>( Arrays.asList( str6.split(""))).toString();

    }
}
