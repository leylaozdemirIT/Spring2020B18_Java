package day12_JavaRecap;
import java.util.Scanner;

public class ScannerNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // String str = input.next();

       // System.out.println(str); // next () only takes the first word

        System.out.println("Enter the number of the building: ");
        // 7921 Jones Branch Dr, McLean VA, 22034
        String fullAddress = "";
        short Bnumber = input.nextShort();
        fullAddress += Bnumber + " ";

        System.out.println("Enter the street name: ");
        String streetname= input.next();
        fullAddress += streetname + " ";

        System.out.println("Enter the type of the road: ");
        String roadType= input.next();
        fullAddress += roadType + ", ";

        System.out.println("Enter city name, state, zipcode: ");
        String cityName = input.next();
        fullAddress += cityName+" ";

        String state = input.next();
        fullAddress += state + ", ";

        int zipcode = input.nextInt();
        fullAddress += zipcode;

        System.out.println(fullAddress);








    }
}
