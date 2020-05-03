package day19_Arrays;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {

        String[] names = {"Leyla", "Derin", "Yasmin", "Onur", "Suzan"};
        //  index            0          1       2          3        4

       System.out.println(names [1]);

        String s1 = names[2];
        System.out.println(s1);


        for (int i = 0; i <= 4; i++) {
            String family = names[i];
            //System.out.println(names[i]);
            System.out.println( family ) ;
        }

        String[] emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};

        for (int i = 0; i <= 3; i++) {
            String email = emails[i];
            if (email.endsWith("@gmail.com")) {
                System.out.println(email);
            }
        }
    }
}
