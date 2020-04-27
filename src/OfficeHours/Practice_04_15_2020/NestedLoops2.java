package OfficeHours.Practice_04_15_2020;

public class NestedLoops2 {

    public static void main(String[] args) {

        int[][] numbers = {{5, 4, 3, 2, 1}, {10, 11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};

        // print all the ODD numbers with regular for loop. MUST use continue statement
        // print all the EVEN numbers with for each loop

        for (int j = 0; j <= numbers.length - 1; j++) { //j:index nums of 1D arrays

            for (int i = 0; i <= numbers[j].length - 1; i++) { //i:index nums of Elements

                if (numbers[j][i] % 2 == 0) {
                    continue;
                }
                System.out.println(numbers[j][i]);
            }
        }
        System.out.println("=====================================");
        for (int [] each1Darray : numbers){

            for (int EachElement: each1Darray ){

                if ( EachElement %2 == 0){
                    continue;
                }
                System.out.println( EachElement );
            }
        }
    }
}
