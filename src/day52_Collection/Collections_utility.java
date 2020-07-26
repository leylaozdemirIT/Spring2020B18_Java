package day52_Collection;

import java.lang.reflect.Array;
import java.util.*;

public class Collections_utility {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,9,8,7,6,5,4));
        Collections.sort(list1);

        System.out.println(list1);

        System.out.println("=======================");
        //write a program that can remove duplicates and print out in sorted ascending order
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll( Arrays.asList(5,5,5,5,5,6,6,6,7,7,7,3,2,2,1,1,1));

        TreeSet<Integer> sorted = new TreeSet<>( nums );

        nums = new ArrayList<>( sorted );

        System.out.println( sorted );
        System.out.println( nums );

        //second way
        nums = new ArrayList<>( new TreeSet<>( nums ));

        System.out.println("=====================================");
        // Write a program that can remove the duplicates from an arraylist - DO NOT change the order
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList (6,6,6,6,5,5,5,4,4,4));

        list = new ArrayList<>( new LinkedHashSet<>(list)); //if we used TreeSet, it would sort it.But req says not to sort it
        System.out.println(list);

        System.out.println("========================================");

        ArrayList<String> letters = new ArrayList<>();
        letters.addAll( Arrays.asList("A","B","C","B","D"));

        boolean result = Collections.frequency(letters, "A") == 1;

        System.out.println(result);

    }
}
