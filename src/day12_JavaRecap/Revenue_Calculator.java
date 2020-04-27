package day12_JavaRecap;

import java.util.Scanner;

/*Revenue can be calculated as the selling price of the product times the quantity sold,
i.e. revenue = price × quantity. Write a program that asks the user to enter product price
and quantity and then calculate the revenue. If the revenue is more than 5000 a discount is 10% offered.
Program should display the discount and net revenue.*/
public class Revenue_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter product price: ");
        int productPrice = input.nextInt();

        System.out.println("Enter quantity: ");
        int quantity = input.nextInt();

        int Revenue = quantity * productPrice;

        if (Revenue > 5000){
            double discountOffered = Revenue * 0.90;
            System.out.println("Discount offered: " + discountOffered);
            double netRevenue = Revenue - discountOffered;
            System.out.println("Your net Revenue is: " + netRevenue);
        }
            System.out.println("Revenue is: " + Revenue);
    }

    }


