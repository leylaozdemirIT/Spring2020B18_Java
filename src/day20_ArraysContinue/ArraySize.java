package day20_ArraysContinue;

public class ArraySize {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
                //    0 1 2
        //System.out.println(arr1[100]); //array's size is fixed

        int[] nums = new int[2]; // {0,0}; index: 0-1
        nums[0] = 10;
        nums [1] = 20;
        // nums [2] = 30; array's size is fixed

        nums = new int[3]; // Reset

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);

    }
}
