package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        Item item1 = new Item("Tomatoes", 5, 1.99);
        Item item2 = new Item("Toilet paper", 25, 100);
        Item item3 = new Item("Canvas", 4, 6);
        Item item4 = new Item("Apron", 5, 1);
        Item item5 = new Item("Isle", 10, 1);

        ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.addAll(Arrays.asList(item1, item2, item3, item4, item5));

        // solution 1 - calculation with for each loop
        double totalCost = 0;
        for (Item each : shoppingList) {
            totalCost += each.calcCost();
        }
        System.out.println("Total: $ " + totalCost);

        // solution 2:
        double totalCost1 = 0;
        for (int i = 0; i < shoppingList.size(); i++) {
            Item each = shoppingList.get(i);
            totalCost1 += each.calcCost();

            // OR double each = shoppingList.get(i).calcCost();
        }
        System.out.println("Total: $ " + totalCost1);
    }
}