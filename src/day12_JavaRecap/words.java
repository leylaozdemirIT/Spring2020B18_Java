package day12_JavaRecap;
/*Ask user to enter two words. Then add them together and print.
        Input:
        one
        eight
        Output:
        oneeight*/
import java.util.Scanner;
public class words {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String totalWord = "";

        System.out.println("Write your first word");
        String word1 = input.next();
        totalWord += word1;
        System.out.println("Write your second word");
        String word2 = input.next();
        totalWord += word2;
        System.out.println(word1+word2);
        System.out.println(totalWord);
    }
}
