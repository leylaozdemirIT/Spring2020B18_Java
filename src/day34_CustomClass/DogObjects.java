package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {
        Dog dog1 = new Dog();

       /* dog1.breed = "Husky";
        dog1.size = "medium";
        dog1.color = "white";
        dog1.age = 3;
        dog1.name = "Lovely";*/
dog1.setDogInfo("Husky","medium",3,"white","Lovely");

Dog dog2 = new Dog(); // we initialized in below instead of writing one by one
dog2.setDogInfo("Cocker Spaniel","medium",3,"light brown", "Latte");

Dog dog3 = new Dog();
dog3.setDogInfo("Poodle","miniature",2,"White","Lucy");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        System.out.println("============================");
        Dog dog4 = new Dog();
        dog4.setDogInfo("Pomerian","small",3,"white", "Ernie");

        Dog dog5 = new Dog();
        dog5.setDogInfo("Pomerian", "small", 4,"White", "Lil");

        ArrayList<Dog> puppies = new ArrayList<>();

        puppies.addAll( Arrays.asList(dog1,dog2,dog3) );
        puppies.addAll( Arrays.asList(dog4, dog5) );

        // print every single Dog

        for (int i=0; i<puppies.size(); i++){
           Dog eachDog = puppies.get(i);
           System.out.println(eachDog);
           //  System.out.println(puppies.get(i)); - same with above 2 lines
        }

        System.out.println("==========================");

        puppies.removeIf( p -> p.age > 2);

        for(int i = 0; i < puppies.size(); i++ ){
            Dog eachdog  = puppies.get(i);
            System.out.println( eachdog );
        }


    }
}
