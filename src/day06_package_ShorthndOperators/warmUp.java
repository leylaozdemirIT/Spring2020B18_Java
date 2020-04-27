package day06_package_ShorthndOperators;

import java.sql.SQLOutput;

public class warmUp {

    public static void main(String[] args) {
        /*warmup task:
        1. write a java program that converts gallons to liters
        1 gallon = 3.785 liters
        1 litter = 1/3.785

        2. write a java program that converts litters to gallons
        1 gallon = 3.785 liters
        1 litter = 1/3.785

        3. manually calculate the following code fragements:
        1. int a = 200;
        int b = -a++ + - --a * a-- % 2
        b = ?

        2. int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;
        */

        double gallon = 5;
        double gallonsInLitters = gallon * 3.785;
        String result = gallon + " gallons is equal to: " + gallonsInLitters + " litters";

        System.out.println(result);

        System.out.println("===============================================================");

        double litter = 100;
        double LittersInGallons = litter / 3.785;
        String result2 = litter + " litters is equal to: " + LittersInGallons + " gallons";

        System.out.println(result2);

        System.out.println("==============================================================");

        int a = 200; //a=199
        int b = -a++ + - --a * a-- % 2;
        // b = -200 + -200 * 200 % 2;
        // b = -200 + -40000 % 2
        // b = -200 + 0
        // b = -200

        System.out.println(b);
        System.out.println(a);

        System.out.println("============================================================");

        int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;
        // z = 300 + 400 - 300 * 400 + 300 / 400
        // z = 300 + 400 - 120000 + 300 / 400
        // z = 300 + 400 - 120000 + 0.75 (compiler will take as int as 0)
        // z = 700 - 120000 + 0
        // z = -119300

        System.out.println(z);








    }
}
