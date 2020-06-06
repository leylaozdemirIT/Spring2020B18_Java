package Interview_Questions.String__CONTINUE;

import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "cba"));
        System.out.println(sameLetters("abc", "abb"));
    }

    public static boolean sameLetters(String str1, String str2) {

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String a1 = "";
        String a2 = "";

        for (char each : ch1) {
            a1 += each;
        }
        for (char each : ch2) {
            a2 += each;
        }

        return a1.equals(a2);


    }
}