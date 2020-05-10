package OfficeHours.Practice_05_09_2020;

public class BestBuy {

    String location;        // instance variables of BestBuy class
    int numberOfEmployees;
    String phoneNumber;
    static int numberOfComputers;

    public void close(){
        System.out.println("This best buy is closed");

    }

    public static void closeAll(){
        System.out.println("All are closing");
    }



}
