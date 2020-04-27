package day21_MultiDimensionalArrays;

public class Zoo {
    public static void main(String[] args) {
        String [] wildAnimals = { "Tiger", "Lion", "Monkey", "Turtle", "Crocodile" };
        String [] birds = { "Eagle", "Ducks", "Peacock", "Chicken" };

        String [] [] zoo = { wildAnimals, birds};

        String kfc = zoo [1] [3]; //chicken
        System.out.println(kfc);
        System.out.println("===========================");

        for ( String eachBirds: zoo [1]){
            if (eachBirds.equals("Chicken")){
                continue;
            }
            System.out.println(eachBirds);
        }
        System.out.println("===================================");

        for ( String eachWildAnimals :  zoo [0]){
            if (eachWildAnimals.equals("Turtle")){
                continue;
            }
            System.out.println(eachWildAnimals);
        }
    }
}
