package day52_Collection;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.util.*;

public class Lists {
    public static void main(String[] args) {
        // List<String> list0= new List<String>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(1); // it is overriden in Arraylist, so it is called from overriden one

        List<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.remove(0);

        System.out.println("===============================================");
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(10);

        Vector<Integer> vector = new Vector<>();
        vector.add(10);

        Stack<Integer> stack = new Stack<>();
        stack.add(10);

        System.out.println("====================================");
        Stack <String> names = new Stack<>(); //LIFO
        names.add("Sha");
        names.add("Dovran");
        names.add("Rahman");
        names.add("Anna");
        names.add("Rustem");
        System.out.println(names);

        String s1 = names.pop(); //Rustem
        System.out.println(s1);

        System.out.println(names);

        String s2 = names.pop(); //Anna will be removed
        System.out.println(s2);

        System.out.println(names);

        String s3 = names.pop();
        System.out.println(s3);

        names.push("Phu");
        System.out.println(names);
    }


    }

