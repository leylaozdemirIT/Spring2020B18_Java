package day14_StringClass;

import java.util.Scanner;

/* userName: cybertek
        password: cybertekschool
         */
public class Credentials {
    public static void main(String[] args) {
        String ValidUserName = "cybertek";
        String ValidPassword = "cybertekschool";

        Scanner input = new Scanner (System.in);

        System.out.println("Enter your username");

        String inputUserName = input.next();

        System.out.println("Enter your password");

        String inputPassword = input.next();

        if (inputUserName.equals(ValidUserName) && (inputPassword.equals(ValidPassword))){
            System.out.println("Logged in successfully");
        } else {
            System.out.println("Invalid credentials");
        }


    }
}
