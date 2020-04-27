package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice2 {

    public static void main(String[] args) {
        /*
        1. create a list of Integers
        2. add 5 integers to it
        3. return the maximum number from the list

        do not use any sorting
         */

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(-50);
        numbers.add(-125);
        numbers.add(150);
        numbers.add(800);

        System.out.println(numbers);

        int maxNum = Integer.MIN_VALUE;


        for (int i = 0; i <= numbers.size()-1; i++) {

            if (numbers.get(i) > maxNum) {
                maxNum = numbers.get(i);
            }
        }
        System.out.println(maxNum);

        System.out.println("=============================");

        int max2 = Integer.MIN_VALUE;

        for (int each : numbers){

            if (numbers.get(each) > max2){
                max2 = numbers.get(each);
            }
            System.out.println(max2);
        }
    }


}
