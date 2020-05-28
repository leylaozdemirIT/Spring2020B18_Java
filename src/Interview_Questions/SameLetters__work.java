package Interview_Questions;

import java.util.Arrays;

public class SameLetters__work {

    public static void main(String[] args) {
        System.out.println(same("abc", "cba"));
        System.out.println(same("abc","abb"));
    }

    public static boolean same(String a, String b){
        char [] ch1 = a.toCharArray(); //{"a", "b","c"}
        char [] ch2 = b.toCharArray(); // {"c","b","a"}

        Arrays.sort(ch1); // a b c
        Arrays.sort(ch2); // a b c

        String a1= "";
        String b1 = "";

        /*
        for (char each:ch1){
        a1 += each; // "abc"
        }
        for (char each: ch2){
            b1 += each; // "abc"
        }
         */

        //return a1.equalsIgnoreCase(b1);
        return Arrays.equals(ch1,ch2);
    }
}
