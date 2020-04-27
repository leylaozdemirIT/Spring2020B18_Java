package day05_Unary_ShorthandOperators;

public class divisibility {

    public static void main(String[] args) {

       /* write a program that can check if a number is evenly divisible by 2, 3, 5,
                Ex:
        number = 65;
        output:
        65 is divisible by 2: false
        65 is divisible by 3: false
        65 is divisible by 5: true
        number = 80;
        output:
        80 is divisible by 2: true
        80 is divisible by 3: false
        80 is divisible by 5: true

        */

       int num1 = 65;

       boolean divisibleby2 = num1 % 2 == 0;
       boolean divisibleby3 = num1 % 3 == 0;
       boolean divisibleby5 = num1 % 5 == 0;

       // option 1:

        System.out.println( num1 + " is divisible by 2: " + divisibleby2 +"\n" + num1 + " is divisible by 3: " +
                divisibleby3 + "\n" + num1 + " is divisible by 5: " + divisibleby5);

        // option 2:
        String result1 = num1 + " is divisible by 2: " + divisibleby2;
        String result2 = num1 + " is divisible by 3: " + divisibleby3;
        String result3 = num1 + " is divisible by 5: " + divisibleby5;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        //OR if you want in 1 statement

        System.out.println(result1 + " \n" + result2 + "\n" + result3);
        // concatenation always results in string
        String finalresult = result1 + " \n" + result2 + "\n" + result3;

        System.out.println(finalresult);

        int num2 = 80;

        boolean num2divisibleby2 = num2 % 2 == 0;
        boolean num2divisibleby3 = num2 % 3 == 0;
        boolean num2divisibleby5 = num2 % 5 == 0;

        String resultNum2 = num2 + " is divisible by 2: " + num2divisibleby2 + "\n" + num2 +
                " is divisible by 3: " + num2divisibleby3 + "\n" + num2 + " is divisible by 5: " +
                num2divisibleby5;

        System.out.println(resultNum2);





    }
}
