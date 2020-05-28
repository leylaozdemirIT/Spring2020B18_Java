package OfficeHours.Practice_05_16_2020;

public class EveryNthClass {
    public String everyNth(String str, int n) {

        String word = "";
        for(int i=0; i < str.length(); i++) {

            if(i % n != 0) continue;

            word += str.charAt(i);
        }

        return word;


        // String word = "";
        // for(int i=0; i < str.length(); i+= n) {
        //   word += str.charAt(i);
        // }

        // return word;

    }

}
