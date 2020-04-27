package OfficeHours.Practice_04_08_2020;

public class nestedLoop_Practice {

    public static void main(String[] args) {

        /*
        nested loop: loop inside another loop
        inner loop & outer loop
        */

        int j = 5;
        while (j < 10) {

            for (int i = 10; i <= 50; i += 10) {
                System.out.print(i + " ");
            }
            System.out.println();

            j++;
        }

        System.out.println("============================");

        /*
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         */

        for (int l = 0; l <= 7; l++) {

            for (int k = 0; k < 6; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("======================================");
        /*
        *
        * *
        * * *
        * * * *
        * * * * *
         */

        for (int i = 1; i <8; i++){

            for (int k = 0; k < i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 8; i > 0; i--){

            for (int k = 0; k < i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }






    }
}
