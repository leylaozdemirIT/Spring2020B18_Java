package Interview_Questions.Array;

import java.util.ArrayList;
import java.util.Arrays;

/*
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)

Ex:

input:  {1,0,2,0,3,0,4,0};

output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
public class MoveZerosToTheEnd {
    public static void main(String[] args) {
      int [] arr =  {1,0,2,0,3,0,4,0};
        System.out.println(moveZeros(arr));

    }

    public static ArrayList<Integer> moveZeros(int [] arr){
        ArrayList<Integer> moveZeros = new ArrayList<>();
        int count = 0;
        for(int each : arr){
            moveZeros.add(each);
            if(each == 0){
                count++; // 4 zeros
            }
        }
        moveZeros.removeAll(Arrays.asList(0));
        for(int i = 0; i <  count; i++){
            moveZeros.add(0);
        }
        return moveZeros;
    }
}

