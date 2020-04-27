package OfficeHours.Practice_03_18_2020;

import java.sql.SQLOutput;

public class SingleIf_Practice2 {

    public static void main(String[] args) {

        byte age = 30;
        boolean eligibleToBuy = age > 21 || age ==21;

        if ( eligibleToBuy){
            System.out.println("Here is your vodka");
        }

        if (age < 21){ // we can also write !boolean - opposite of boolean
            System.out.println("Go drink your milk");
        }

        System.out.println("==================================================");

        boolean feeling = false;

        if (feeling == false){
            System.out.println("Don't be sad");
        }

        if (feeling != false){
            System.out.println("Stay happy");
        }

    }}
