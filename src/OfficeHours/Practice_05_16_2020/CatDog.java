package OfficeHours.Practice_05_16_2020;

public class CatDog {
    public boolean catDog(String str) {

        int cat = 0;
        int dog = 0;

        for(int i=0; i < str.length()-2; i++) {

            String word = str.substring(i, i+3);

            if(word.equals("cat")) cat++;

            if(word.equals("dog")) dog++;

        }

        return cat == dog;

    }


}

