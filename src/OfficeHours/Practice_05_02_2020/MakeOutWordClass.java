package OfficeHours.Practice_05_02_2020;

public class MakeOutWordClass {


    public String makeOutWord(String out, String word) {

        String front = out.substring(0, 2);
        String back = out.substring(2);

        return front + word + back;
    }

}