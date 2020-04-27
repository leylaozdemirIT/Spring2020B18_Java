package day12_JavaRecap;
import java.util.Scanner;
public class ScannerNextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter some number: ");
        int num = input.nextInt(); // 13 + enter
        System.out.println(num);

        input.nextLine();
        System.out.println("Enter your name: ");
        String name = input.nextLine(); // enter + enter + enter + "Muhtar"
        System.out.println(name);



    }
}
