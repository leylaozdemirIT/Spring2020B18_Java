package day22_Arrays_Loops;

public class NestedLoops_Practice {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6, 7, 8, 9}, {10, 11, 12, 13, 14}, {15, 16, 17, 18, 19, 20, 21}};

        // print all even numbers in same line
        // count odd numbers ==> return the total number
        int countOdd = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {

            for (int j = 0; j <= numbers[i].length - 1; j++) {

                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");
                } else {
                    countOdd++;
                }
            }
        }
        System.out.println();
        System.out.println(countOdd);
    }
}
