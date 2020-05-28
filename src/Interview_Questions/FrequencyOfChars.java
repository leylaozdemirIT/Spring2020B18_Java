package Interview_Questions;
// write a return method that can find the frequency of characters
public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = FrequencyOfChars("AAABBCCDDDD");
        System.out.println(str);

    }

    public static String FrequencyOfChars(String str) {

        String nonDup = "";

        for (int i = 0; i < str.length(); i++)

            if (!nonDup.contains("" + str.charAt(i)))

                nonDup += "" + str.charAt(i);


        String expectedResult = "";

        for (int j = 0; j < nonDup.length(); j++) {

            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == nonDup.charAt(j))

                    count++;

            }

            expectedResult += nonDup.charAt(j) + "" + count;

        }

        return expectedResult;

    }
}