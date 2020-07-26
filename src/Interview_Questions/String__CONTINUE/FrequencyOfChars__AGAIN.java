package Interview_Questions.String__CONTINUE;
// write a return method that can find the frequency of characters
public class FrequencyOfChars__AGAIN {
    public static void main(String[] args) {
        System.out.println(FrequencyOfChars("AAABBCCDDDD"));
    }

    public static String FrequencyOfChars(String str) {
        //AAABBCCDDD
        String nonDup = ""; // ABCD
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += str.charAt(i);
            }
        }
        String result = "";
        for (int i = 0; i < nonDup.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == nonDup.charAt(i)) {
                    count++;
                }
            }
            result += nonDup.charAt(i) + "" + count;
        }
        return result;

    }
}