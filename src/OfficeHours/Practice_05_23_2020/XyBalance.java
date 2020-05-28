package OfficeHours.Practice_05_23_2020;

public class XyBalance {

    public boolean xyBalance(String str) {

        for(int i=0; i < str.length(); i++) {

            if(str.charAt(i) == 'x'){
                if(!str.substring(i).contains("y")) return false;
            }

        }

        return true;
    }

}

