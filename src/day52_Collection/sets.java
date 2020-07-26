package day52_Collection;

import java.util.*;

public class sets {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Sha");
        names.add("Zuura");
        names.add("Saban");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");

        System.out.println(names);

        String[] arr = {"A","A","C","B","A"}; //A C B

        LinkedHashSet <String> set1 = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set1);

       // System.out.println( set1.get(1)); // Set does not have index number

        System.out.println("=============================================");
        Set<Integer> numbers = new TreeSet<>();
        numbers.addAll( Arrays.asList(10,9,10,9,8,7,8,7,5,6));
        //Tree set removes the duplicates and sorts the objects
        System.out.println(numbers);

        System.out.println("=====================");
        TreeSet<String> treeset = new TreeSet<>();
        treeset.add(null);

        System.out.println(treeset); //treeset does not accept null

        System.out.println("=============================");
        HashSet<String> hashset = new HashSet<>();
        hashset.add(null); // hashset accepts null

        System.out.println(hashset);

    }
}
