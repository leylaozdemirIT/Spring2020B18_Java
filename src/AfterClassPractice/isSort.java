package AfterClassPractice;

import java.util.*; // DO IT AGAIN - COPIED

class isSort {

    public static void main(String[] args) {

    }
    public static boolean isSort(int[] nums) {

        String a = Arrays.toString(nums); //5,6,8,10
        int[] sorted = nums;
        Arrays.sort(sorted);

        String b = Arrays.toString(sorted);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(sorted));
        return (a.equals(b)) ? true : false;

    }
}