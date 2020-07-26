package Interview_Questions2.String;

import java.util.Arrays;

/*Write a return method that check if a string is build out of the same letters as another string.

        Ex:  same("abc",  "cab"); -> true

        same("abc",  "abb"); -> false:*/
public class SameLetters {
    public static void main(String[] args) {
        System.out.println(same("abc","cab"));
        System.out.println(same("abc","abb"));
    }
    public static boolean same(String str1, String str2){
        char [] r1 = str1.toCharArray();
        char [] r2 = str2.toCharArray();

        Arrays.sort(r1);
        Arrays.sort(r2);

        String a1 = "";
        String a2 = "";

        for(char each:r1){
            a1 += each;
        }
        for(char each: r2){
            a2 += each;
        }

        return a1.equals(a2);
    }

}
