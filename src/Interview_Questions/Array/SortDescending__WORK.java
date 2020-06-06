package Interview_Questions.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class SortDescending__WORK {

    public static void main(String[] args) {
        int []arr = {40,50,70};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] Sort(int[] a) {

        ArrayList<Integer> list=new ArrayList<Integer>();

        for(int each: a)

            list.add(each);



        for(int i=0; i < a.length; i++) {

            a[i] = findMax(list);

            list.remove(Integer.valueOf(a[i]));

        }

        return a;

    }



    public static int findMax(ArrayList<Integer> a) {

        int max=Integer.MIN_VALUE;

        for(int each: a)

            max = Math.max(max, each);

        return max;

    }
}
