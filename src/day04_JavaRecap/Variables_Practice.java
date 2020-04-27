package day04_JavaRecap;

import java.sql.SQLOutput;

public class Variables_Practice {

    public static void main(String[] args) {
 // Datatype VariableName = Data;

        byte num1 = 127;
        short num2 = num1; // short is large enough to contain byte
        // double > float > long > int > short > byte

        // byte num3 = num2;

        int num4 = num2; // int is prefered by compiler

        long num5 = 9999999999l;

        float num6 = 100L;
        System.out.println(num6); // 100.0

        float num7 = 0.5f;
        System.out.println(num7); //0.5

        double num8 = 0.5f;
        double num9 = 9999999L;
        System.out.println(num9);
        double num10 = 100.5;
        System.out.println(num10);

        char ch1 = '$'; //everysingle character has a number
        System.out.println(ch1);

        char ch2 = 22000; // 0 till 65565
        System.out.println(ch2);

        int a1 = '8';
        System.out.println(a1); //56

        int a2 = 'z';
        System.out.println(a2); //56

        double d1 = 'z'+'8';  //z8, 178, or 178.0
        System.out.println(d1);

        char ch3 = 178;
        System.out.println(ch3);

        char ch4 = 'z' + '8';
        System.out.println(ch4);

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println( 9 > 10);

        System.out.println( 9 >= 9);

        System.out.println( 'a' == 'b');

       // System.out.println( 'a' == "a");

        System.out.println( 'a' == 'b' - 1);
        // 97 == 98-1
        // 97 == 97

        System.out.println( "Muhtar" == "Good Guy"); //false, two different text

        System.out.println( "Muhtar" != "Good Guy");

        System.out.println( "Muhtar" == "muhtar"); // false, case sensitive

        // System.out.println("Cybertek" == 10000); // false , datas are different

        boolean r1 = !true; // false, gives the opposite of
        System.out.println( r1);
        System.out.println( !r1); // true

        System.out.println( !true == false); // true
        System.out.println( !true == !false); // false









    }


}
