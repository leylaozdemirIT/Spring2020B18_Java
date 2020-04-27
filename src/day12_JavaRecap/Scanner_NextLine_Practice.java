package day12_JavaRecap;
import java.util.Scanner;
public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 7921 Jones Branch Dr, McLean VA, 22034
        // fullAddress = Building-number Street, City State, zipcode

        System.out.println("Enter building number: ");
        String buildingNumber = input.next();
        System.out.println("Building number is: " + buildingNumber);

        input.nextLine(); // used for taking out the Enter from the scanner

        System.out.println("Street: ");
        String street = input.nextLine();
        System.out.println("Street is: " + street);

        System.out.println("Enter the zipcode: ");
        int zipcode = input.nextInt(); //22034Enter

        input.nextLine(); // take out Enter

        System.out.println("Enter the city name and state seperated by comma and space");
        String cityState = input.nextLine();                ;
        String fullAddress = buildingNumber+ " " + street + ", \n" + cityState + " " + zipcode;

        System.out.println(fullAddress);

        input.close();


    }
}
