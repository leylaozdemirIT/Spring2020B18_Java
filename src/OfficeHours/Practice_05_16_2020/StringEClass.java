package OfficeHours.Practice_05_16_2020;

public class StringEClass {
    public boolean stringE(String str) {

        int count = 0;

        while(str.contains("e")) { // hllo

            count++;
            str = str.replaceFirst("e",""); //hllo

        }

        return count >= 1 && count <= 3;

        // int count = 0;
        // for(int i =0; i < str.length(); i++) {

        //   if(str.charAt(i) == 'e') count++;

        // }

        // return count >= 1 && count <= 3;

    }

}

