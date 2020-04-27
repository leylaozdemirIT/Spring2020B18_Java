package day14_StringClass;
/*Ask user to enter two words. Print the first word, second word, second word, first word
        Input:
        one
        two
        Output:
        onetwotwoone
        DO NOT USE + OPERATOR*/
import java.util.Scanner;

public class combineTwoString {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the first word");
        String word1 = input.next();
        System.out.println("Enter the second word");
        String word2 = input.next();

        String Result = word1.concat(" "+word2).concat(" "+word2).concat(" "+word1);
        System.out.println(Result);

    }
}
