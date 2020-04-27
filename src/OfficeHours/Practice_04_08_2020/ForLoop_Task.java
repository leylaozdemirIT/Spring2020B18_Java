package OfficeHours.Practice_04_08_2020;

public class ForLoop_Task {

    public static void main(String[] args) {

        /*
        print all the numbers that can be divisible by 3 or 5
         */

        for (int i=0; i<=100; i++){

            if (i%3==0 || i%5==0){
                System.out.print( i+ " ");
            }
        }
        System.out.println();

        System.out.println("======================================");

        String name = "Leyla";
                    // 01234
        String result = "";
        int lastIndex = name.length()-1;

        for (int i = lastIndex; i>= 0; i--){
           //  result = result + name.charAt(i);
            result = result + name.substring(i, i+1);
                                    // 3, 4
                                    // 2, 3
                                    // 1, 2
                                    // 0, 1
        }
        System.out.println(result);

        if (name.equalsIgnoreCase(result)){
            System.out.println(name + " is a palindrome name");
        }else {
            System.out.println(name + " is not a palindrome name");
        }
    }
}
