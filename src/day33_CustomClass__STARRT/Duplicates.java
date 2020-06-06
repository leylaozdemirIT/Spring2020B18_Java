package day33_CustomClass__STARRT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Duplicates {
    public static void main(String[] args) {
        /*
write a program that can return the duplicated objects from a an ArrayList of Integers
    Ex:    list: {1,1,2,3,4,5,5}
           sout(list); ==> {1,1,5,5};
    Note: 1. DO NOT use any extra arrayList
		  2. DO NOT use any loops
		  3. DO NOT use any sort method
		  4. Use predicate and collections methods only
		  Hint:   Collections.frequency() // will return the frequency
			removeIf( frequency > 1)  can keep the duplicated objects in arrayList

			  */

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll ( Arrays.asList(1,1,2,3,4,5,5) );

        list.removeIf( p-> Collections.frequency(list,p) == 1);

        System.out.println(list); // [1,1,5,5]

        System.out.println( new LinkedHashSet<>(list) ); // we will learn in the future


    }

}