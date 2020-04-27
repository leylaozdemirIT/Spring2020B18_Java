package day16_ForLoop;

import java.util.Scanner;

/*
        write a program to identify if a string is palindrome or not. if yes==> true,
        otherwise ==> false
                level ==> level ==> palindrome
         */
public class palindromeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Write your words");
        String word = input.nextLine();

        String reverseWord = "";

        for (int i = word.length()-1; i>=0 ; i-- ){
            reverseWord += word.charAt(i);
        }
        System.out.println(reverseWord);
        boolean palindrome = word.equalsIgnoreCase(reverseWord);

        System.out.println(palindrome);


    }
}
