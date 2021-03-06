package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // list.remove(1);

      //  String str = "B";
       boolean r1 = list.remove("F"); // boolean result is true
        // or you can list.remove(str);
        boolean r2 = list.remove("A"); // boolean result is true

        System.out.println(list);
        System.out.println(r1);
        System.out.println(r2);

       list.clear();
        System.out.println(list);
        System.out.println(list.size());

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);   // index:0
        list2.add(1);   //      :1
        list2.add(2);   // index:2
        list2.add(3);   // index:3

        int num1 = list2.indexOf(1); // 0
        // Integer = int // Autoboxing

        System.out.println(num1);

        int num2 = list2.indexOf(100); // if Object does not exit, it will give you -1
        System.out.println(num2);

        int num3 = list2.indexOf(3);
        System.out.println(num3);

    }
}
