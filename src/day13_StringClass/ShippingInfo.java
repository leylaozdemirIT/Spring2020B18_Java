package day13_StringClass;
/* write a program for the shipping info that, the program should ask:
    building number
    Street address (Assume it has more than one word)
    city name
    state name
    zip code
    full name of the person:
    and prints the ship to info in the following format:
    ex output:
    Ship To:  Jimmy joe
              7925 Jones Branch Dr
              MCLean, VA 22102*/
import java.util.Scanner;
public class ShippingInfo {
public static void main(String[]args){

    Scanner input = new Scanner (System.in);

    System.out.println("Your building number:");
    String Bnumber = input.next();

    input.nextLine(); // takes out Enter from the Scanner

        System.out.println("Street address");
        String address = input.nextLine();

        System.out.println("City name:");
        String cityName = input.nextLine();

        System.out.println("State name:");
        String stateName = input.nextLine();

        System.out.println("Zipcode");
        String zipCode = input.next();

        input.nextLine();

        System.out.println("Your full name:");
        String fullName = input.nextLine();

        System.out.println("Ship to: " + fullName + "\n\t\t" + Bnumber + " " +
        address + "\n\t\t" + cityName + ", " + stateName + " " + zipCode);
        }}




