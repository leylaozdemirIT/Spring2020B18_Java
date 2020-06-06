package Interview_Questions.ArrayList__DO;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Sort_in_descending {

    public static void main(String[] args) {


    }




    public static ArrayList<Integer> sortDescending (ArrayList<Integer>nums){

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=nums.size()-1; i>=0; i--){
            list.add(list.get(i));
        }

        return list;
    }
}
