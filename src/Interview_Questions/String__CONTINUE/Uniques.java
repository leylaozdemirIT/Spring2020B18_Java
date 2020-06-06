package Interview_Questions.String__CONTINUE;

public class Uniques {
    public static void main(String[] args) {
        System.out.println(FindTheUnique("AAAABBBBBCDDDDE"));
    }



public static String FindTheUnique(String str) {

// AAAABBBBBCDDDDE
    String uniques = "";


    for (int j = 0; j < str.length(); j++) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==str.charAt(j)) {
                count++;
            }

        }

        if (count == 1) {
            uniques += str.charAt(j);
        }
    }
    return uniques;
}
}


