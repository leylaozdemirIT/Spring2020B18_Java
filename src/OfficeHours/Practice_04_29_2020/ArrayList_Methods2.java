package OfficeHours.Practice_04_29_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {
        // indexOf(Object) ==> returns the index num
        ArrayList<Character> list1 = new ArrayList<>();
        list1.add('A');
        list1.add('B');
        list1.add('C');
        list1.add('D');
        list1.add('C');
        list1.add('C');

        int indexNum = list1.indexOf('C'); // 2
        System.out.println(indexNum);

        int lastNum = list1.lastIndexOf('C'); // 4
        System.out.println(lastNum);



    }

}
