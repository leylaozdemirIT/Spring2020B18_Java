package day24_Methods__repeat;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
    String str = "Leyla";

    String RevStr = Library.Reverse2(str);

    System.out.println(RevStr);

    int [] arr = {5,9,10,3,2,-1};

    int [] desc = Library.sortDescending(arr);

        System.out.println(Arrays.toString(desc));





    }
}