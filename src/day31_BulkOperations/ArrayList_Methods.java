package day31_BulkOperations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");

        boolean r1 = list1.contains("D");
        System.out.println(r1);

        ArrayList<String> list2 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");

        boolean r2 = list1.equals(list2);
        System.out.println(r2);
        // Arrays.equal (arr1, arr2)

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(100);
        list3.add(1000);
        list3.add(20);

        Collections.sort(list3);

        ArrayList<Integer> reversedList3 = new ArrayList<>();

        for (int i=list3.size()-1; i>=0; i-- ){
            System.out.print(list3.get(i) + " ");
            reversedList3.add( list3.get(i) );
        }
        System.out.println(reversedList3);

    }
}
