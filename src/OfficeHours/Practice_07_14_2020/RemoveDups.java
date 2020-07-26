package OfficeHours.Practice_07_14_2020;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDups {

/*
    * Create a method that will accept a String
    * and returns a version that removes duplicate
    * instances of any character
    Ex: removeDup("AAABBBCCCD") ==> ABCD
     */


    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCCD"));
    }
    public static String removeDup(String s) {
        return new LinkedHashSet<String>(Arrays.asList(s.split(""))).toString()
                .replace("[","").replace("]","").
                        replace(", ", "");
    }




}
