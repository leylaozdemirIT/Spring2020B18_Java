package day34_CustomClass___SAT;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjectMemory {

    int i = 1000; // this is instance variable.it is declared outside the method.Heap memory

    public static void main(String[] args) { // main method: Stack memory
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40)); // heap memory
        // list1 - Stack memory
        ArrayList<Integer> list2 = list1;

        list1.remove(2);
        System.out.println(list1);
        System.out.println(list2);

        System.out.println("======================");

        String str1 = new String("cybertek");
        String str2 = str1; // first object. Stored in Heap

        str1 = str1.toUpperCase(); // new object CYBERTEK

        System.out.println(str1);
        System.out.println(str2);

        int a = 300; // Stack memory
    }
}
