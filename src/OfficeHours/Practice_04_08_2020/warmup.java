package OfficeHours.Practice_04_08_2020;

import java.util.Scanner;

public class warmup {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter username");
        String username = input.nextLine();

        System.out.println("Enter your password");
        String password = input.next();

        if (username.endsWith("@yahoo.com")){

         if (username.equals("onurleyla@yahoo.com") && password.equals("Rockville20850")){
            System.out.println("logged in successfully");
        }else{ if (username.equals("onurleyla@yahoo.com") && !password.equals("Rockville20850")){
            System.out.println("Invalid password");
        } else if (!username.equals("onurleyla@yahoo.com") && password.equals ("Rockville20850")){
             System.out.println("Invalid username");
         }else {
            System.out.println("it's not a valid email address");
        }
}}}}
