package OfficeHours.Practice_04_22_2020;

public class Void_Method {
    public static void main(String[] args) {
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");

        System.out.println("================================");

        print();

        System.out.println("=================================");
        boolean UScitizen = true;
        int age = 16;

        Vote(age, UScitizen);
        Vote(21,UScitizen); //true, we can assign either the variable name OR value
        Vote(25,true);

        System.out.println("===================================");

        BuyCigarette(16);

    }
    public static void print (){
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
    }

    /*
    write a function if a person is eligible or not
    // MUST know: age, citizenship
     */

    public static void Vote (int age, boolean UScitizen){
        boolean eligibleToVote = age>=18 && UScitizen == true;

        if (eligibleToVote){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are NOT eligible to vote");
        }
    }
    // write a program to buy cigarette eligibility
    public static void BuyCigarette (int age){
    boolean canBuy= age>=18;
    if (canBuy){
        System.out.println("You are eligible to buy Cigarette");
    } else {
        System.out.println("You are NOT eligible to buy cigarette");
    }

    }
}
