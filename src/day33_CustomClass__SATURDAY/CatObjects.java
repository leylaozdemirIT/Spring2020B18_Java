package day33_CustomClass__SATURDAY;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setCatInfo("Siemes","White",5,"Sasha");

        System.out.println(cat1);
        System.out.println("==================================");

        Cat cat2 = new Cat();
        cat2.setCatInfo("Scottish", "Beige", 7,"Bobo");

        Cat cat3 = new Cat();
        cat3.setCatInfo("Calico", "brown-white", 6,"Cinnamon");

        ArrayList<Cat> catList = new ArrayList<>();
        catList.addAll( Arrays.asList(cat1, cat2, cat3) );

        for (int i=0; i<catList.size(); i++){
            System.out.println( catList.get(i) );
        }
        for (Cat eachCat : catList){
            System.out.println(eachCat);
        }

        System.out.println("==========================");

        cat1.sleep();
        cat2.sleep();
        cat3.sleep();

        System.out.println("===========================");

        cat1.eat("cat treats");
        cat2.eat("fish");
        cat3.eat("sish kabab");

        System.out.println("===============================");

        cat1.drink("water");
        cat2.drink("water");
        cat3.drink("water");
    }
}
