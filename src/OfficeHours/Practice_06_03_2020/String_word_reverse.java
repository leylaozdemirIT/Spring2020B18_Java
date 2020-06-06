package OfficeHours.Practice_06_03_2020;

public class String_word_reverse {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("The House is big"));
    }

    public static String reverseEachWord(String str){
        String [] words = str.split(" ");
        String finalWord = "";

        for (String word:words){
            String reverse = "";
            for(int i=word.length()-1; i>=0; i--){
                reverse += word.charAt(i);
            }
            finalWord += reverse + " ";
        }
        return finalWord;
    }
}



