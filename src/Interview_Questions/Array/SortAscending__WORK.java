package Interview_Questions.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class SortAscending__WORK {
    /*
    Write a return method that can sort an int array in Ascending order
    without using the sort method of the Arrays class
     */


    public static void main(String[] args) {
        int[] arr = {5, 8, -2, 3, -10};
        SortAscending(arr);
        System.out.println(arr);

    }

    public static void SortAscending(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : arr) {
            list.add(each);
        }
        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }

        }

        for (int i = 0; i < list.size(); i++) {

            arr[i] = list.get(i);

        }

    }
}


