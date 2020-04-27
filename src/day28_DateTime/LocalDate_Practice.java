package day28_DateTime;

import java.time.LocalDate;
import java.util.Arrays;

public class LocalDate_Practice {
/*
create an array of string, store five of your friends names in it
create Array of localdates and store thier birthdays in the same order
use for loop to print out your friends' names and thier birthdays
 */
    public static void main(String[] args) {

        String [] friends = {"Yasmin", "Derin", "Leyla","Onur"};

        LocalDate YasminBirtday = LocalDate.of(2002,11,14);
        LocalDate DerinBirtday = LocalDate.of(2007,9,4);
        LocalDate LeylaBirtday = LocalDate.of(1974,12,31);
        LocalDate OnurBirtday = LocalDate.of(1966,10,31);

        LocalDate [] Birthdays = {YasminBirtday, DerinBirtday, LeylaBirtday, OnurBirtday};

        System.out.println (Arrays.toString(Birthdays) );

        System.out.println("=======================================");

        for (int i=0; i<friends.length; i++){
            String names = friends[i];
            LocalDate bd = Birthdays[i];

            System.out.println( names + "'s birthday is " + bd);
        }
        int a = 100;
        int b = 200;
        int c = 300;

        int [] numbers = {a,b,c};



    }
}
