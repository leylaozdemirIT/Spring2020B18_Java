package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaObjects {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("small",5,1);
        Pizza pizza2 = new Pizza("medium",3,1);
        Pizza pizza3 = new Pizza("large", 5,1);
        Pizza pizza4 = new Pizza("small",2,3);
        Pizza pizza5 = new Pizza("medium",4,3);

        ArrayList<Pizza> pizzas = new ArrayList<>(Arrays.asList(pizza1,pizza2,pizza3,pizza4,pizza5));

        double cost = 0;
        for (Pizza each:pizzas){
            cost += each.calcCost();
            System.out.println(each.calcCost());
        }
        System.out.println("Total Cost: $ "+cost);
    }


}
