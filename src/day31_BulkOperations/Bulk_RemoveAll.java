package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_RemoveAll {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,1,3,3,3,3,3,3));

        ArrayList<Integer> removedList = new ArrayList<>();
/*
        Integer a = 1;
        list.remove(a);
        list.remove(a);

        Integer b = 3;
        list.remove(b);
        list.remove(b);

        System.out.println(list);
        */
        list.removeAll( Arrays.asList(1,3) );

        System.out.println(list);
        System.out.println("==========================");

        String [] names = {"Ahmed", "John", "Aaron", "Ahmed", "Daniel"};

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        System.out.println(nameList);

        nameList.removeAll( Arrays.asList("Ahmed") );

        System.out.println(nameList);

}}
