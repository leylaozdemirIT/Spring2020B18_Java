package Interview_Questions.ArrayList__DO;
/*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
        Write a java operation to remove all the names named Ahmed*/

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Ahmed {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Leyla", "Madina", "Ahmed", "Ahmed"));
        names.removeAll(Arrays.asList("Ahmed"));
        System.out.println(names);

        System.out.println("====================================");

        ArrayList<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Leyla", "Madina", "Ahmed", "Ahmed"));
        names2.removeIf(p->p.equals("Ahmed"));
        System.out.println(names2);

    }
    }
