package day14_StringClass;
/* Ask user to enter two words. Print first word without its first character then
print the second word without its first character.
        Input:
        apple
        banana
        Output:
        ppleanana*/

import java.util.Scanner;

public class combineTwoString2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first word");
        String firstword = input.next();
        firstword = firstword.substring(1,firstword.length());
        // ending index firstword.length() ==> you do not have to write it

        System.out.println("Enter your second word");
        String secondword= input.next();
        secondword = secondword.substring(1, secondword.length());

        String result = firstword.concat(secondword);
        System.out.println(result);

    }
}
