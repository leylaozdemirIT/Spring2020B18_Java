package day12_JavaRecap;
/*write a program that can calculate the area of circle
        needed information:
        1. radius of the cirle*/

import java.util.Scanner;
public class areaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("radius of the circle");
        byte radius = input.nextByte();

        double area = (radius * radius * 3.14);
        System.out.println("Area of the circle is " + area);

    }

}
