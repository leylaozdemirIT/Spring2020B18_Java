package day53_Iterator_Maps;

import java.util.*;

public class Collection_Practice {

    /*
     access-modifiers specifier return-type methodsName(parameter)
     specifiers: static, final, abstract, synchronized
     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list = Collections.synchronizedList(list); //now it became synchronized thread-safe

        Set<Integer> set = new HashSet<>();
        set = Collections.synchronizedSet(set); //thread safe

        System.out.println("============================");

        String [] arr = {"E","E","B","A","D","D","C"}; //only if the object type is primitive
        LinkedHashSet<String> st = new LinkedHashSet<>( Arrays.asList(arr) );
        // we converted array to List by using Arrays.asList method. Because Constructor only accepts collections

        System.out.println(st);

        /*
        for(String each : arr){
            st.add(each); // adding one by one by iterating
        }

         */

        ArrayList<String> arraylist = new ArrayList<>(Arrays.asList("E","E","B","A","D","D","C"));
        LinkedHashSet<String> st2 = new LinkedHashSet<>(arraylist);

        System.out.println(st2);
    }

    public synchronized void append(){

    }
}
