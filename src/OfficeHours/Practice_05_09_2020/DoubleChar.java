package OfficeHours.Practice_05_09_2020;

public class DoubleChar {

    public String doubleChar(String str) {
        String word = "";
        for(int i=0; i < str.length(); i++) {
            //word += "" + str.charAt(i) + str.charAt(i);
            word += str.substring(i, i+1) + str.substring(i, i+1);

        }

        return word;

    }

}