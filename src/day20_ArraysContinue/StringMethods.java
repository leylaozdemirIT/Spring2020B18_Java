package day20_ArraysContinue;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {
        String name = "Leyla";
        char [] characters = name.toCharArray();

        System.out.println( Arrays.toString (characters));

        String str1 = "Cybertek School";
        String str2 = "School Cybertek";

        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println( Arrays.toString(ch1));
        System.out.println( Arrays.toString(ch2));

        boolean equalStr = Arrays.equals(ch1, ch2);

        System.out.println( equalStr ); //str1 and str2 are build out of same characters

    }
}
