package day54_Maps;

import java.*;

public class String_vs_Buffer_vs_Builder {

    public static void main(String[] args) {

        String str1 = "Cybertek";
        str1.concat(" School"); // "Cybertek School"

        System.out.println(str1);

        System.out.println("=================================");

        StringBuilder builder = new StringBuilder("Cybertek");
        builder.append(" School");

        System.out.println(builder);

        System.out.println("==============================");
        StringBuffer buffer = new StringBuffer("Cybertek");
        buffer.append(" School");

        System.out.println(buffer);


        System.out.println("===============================");

        String word = "ABCD";

        StringBuilder sb = new StringBuilder(word);
        sb.reverse();

        System.out.println(sb);

        word = sb.toString();

        System.out.println(word);



    }
}
