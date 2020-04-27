package OfficeHours.Practice_03_25_2020;

public class NestedIf_Practice2 {
    public static void main(String[] args) {
        /*
        for the loan:
        if the person has a job that pays > 50000 ==> might be eligible
        if he/she has a good credit
        if job history is more than or equal to 2 ==> then eligible
         */

        int salary = 60000;
        short creditScore = 750;
        byte jobHistory = 3;

        if (salary > 50000){//might be eligible

            if (creditScore > 650){ // might be eligible

                if (jobHistory >= 2) { // eligible for loan
                    System.out.println("You are qualified");
                }else {
                    System.out.println("You do not have enough job history, come back later");
                }
            }else {
                System.out.println("You do not have good credit score");
            }












        } else {
            System.out.println("You need to have a job that pays $ 50000");
        }









    }
}
