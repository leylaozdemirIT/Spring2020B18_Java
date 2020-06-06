package Interview_Questions.ArrayList__DO;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Remove_someValues {

    public static void main(String[] args) {
    ArrayList<Integer>list = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
    RemoveSomeValues();

    RemoveValues2();

    }

    public static void RemoveSomeValues(){
        ArrayList<Integer> list1;
        list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int each: list1){
            if (each<100){
                list2.add(each);
            }
        }


        System.out.println(list2);
    }
    public static void RemoveValues2(){
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        nums.removeIf(p->p>100);
        System.out.println(nums);
    }
}
