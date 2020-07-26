package Interview_Questions.String__CONTINUE;

public class Uniques {
    public static void main(String[] args) {
        System.out.println(FindTheUnique("AAAABBBBBCDDDDE"));
    }



public static String FindTheUnique(String str) {

// AAAABBBBBCDDDDE
    String uniques = "";
    for (int i = 0; i < str.length(); i++) {
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == str.charAt(i)) {
                count++;
            }
        }
        if (count == 1) {
            uniques += str.charAt(i);
        }
    }
    return uniques;
}}
