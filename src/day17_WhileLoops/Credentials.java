package day17_WhileLoops;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        /*
        user: cybertek
        pass: cybertek123
         */
        Scanner input = new Scanner (System.in);

        System.out.println("Enter username");
        String username = input.next();

        System.out.println("Enter password");
        String password = input.next();

        boolean valid = username.equals("cybertek") && password.equals("cybertek123"); //false
        // validating the first username and password

        int count = 1;

        while ( ! valid ) {
            System.out.println("Please re enter your credentials");
            System.out.println("Enter username");
            username = input.next();

            System.out.println("Enter password");
            password = input.next();

            valid = (username.equals("cybertek") && password.equals("cybertek123"));
            // validating new username and passwords

            count++;
            if (count == 3 && !valid) { //already have three attempts and credentials are still incorrect
                System.out.println("Your account is locked");
                break;
            }
            if (valid) {
                System.out.println("Logged in");
            }
        }


}}
