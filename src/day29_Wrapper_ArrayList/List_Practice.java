package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice {

    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Milk"); // right now size is 1 - index 0
        shoppingList.add("Coffee"); // size is 2- index 1
        shoppingList.add("Bread");  // size is 3
        shoppingList.add("Toilet Paper");// size is 4
        shoppingList.add("Egg"); // size is 5

        System.out.println(shoppingList);

        for (int i=0; i< 4 ; i++){
            System.out.println(shoppingList.get(i));

            System.out.println("===============================");

        for (String each : shoppingList){
            System.out.println(each);
        }
        // size():

            int size = shoppingList.size();
            System.out.println(size);

            int lastIndex = shoppingList.size()-1;


        }



    }
}
