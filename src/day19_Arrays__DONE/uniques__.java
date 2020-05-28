package day19_Arrays__DONE;

import java.util.Scanner;

/*1. write a program that can return the unique characters from a string
        Ex:  "AABCC" ==> "B"
     */
public class uniques__ {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = input.next();

        String result =""; // to store the unique characters

        for (int j=0; j<= str.length()-1; j++){
            char ch2 = str.charAt(j);


            int count = 0; //to count the occurence of the character
            for (int i=0; i<= str.length()-1; i++ ) {
                char ch = str.charAt(i);
                if(ch == ch2){ //check how many times the character is occured in the string
                    count++;
                }
            }
            if (count == 1){
                result += ch2;
            }
        }
        System.out.println(result);





    }
}
