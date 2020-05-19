package day23_methods__repeat;

import java.util.Scanner;

public class Methods_WithParameters {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your age");
        byte age = input.nextByte();

        EligibleToBuyAlcohol(age); // date type must match; compiler takes int as prefered
        // if you put byte inside the parameter. then you have to do explicit casting
        }

    public static void EligibleToBuyAlcohol (byte age){

        if (age >=21){
            System.out.println("Eligible to buy alcohol");
        }else {
            System.out.println("Eligible to buy milk");
        }

    }
}
