package day05_Unary_ShorthandOperators;

public class ArithmeticOperators {

    public static void main(String[] args) {
      //  10 / 3 ==> 3.3333
        int a1 = 10 / 3 ; //3
        System.out.println(a1);

        // 10 / 4 ==> 2.5
        System.out.println( 10 / 4); //compiler takes it as int, so gives the whole number

        double d = 10/4;
        // double d = 2;
        // d ==> 2.0
        System.out.println(10/4); //2.0

        System.out.println( 10.0 / 4);

        System.out.println( 10 / 4.0);

        System.out.println( 10.0 / 4.0); //taken as int

        // 10 / 4 = 2.5; this is the actual part
        // but as it is taken int, only takes the int part

        float f1 = 10 / 4;
        // float f1 = 2;
        System.out.println(f1); //2.0

        boolean evenNumber = 25 % 2 == 0;
        // 1 == 0, this is not equal so this is false
        // if 25/ 2 has a reminder of 0, then it is an even number

        System.out.println(evenNumber);
        System.out.println( 25 % 2);

        System.out.println("============================================================");

        boolean oddNumber = 22 % 2 != 0;
        // remainder is 0 != 0

        System.out.println( 10 % 2 == 0 );
        System.out.println( 11 % 2 != 0 );

        System.out.println("10 is even number: " + ( 10 % 2 == 0 ));
        System.out.println("11 is even number: " + ( 11 % 2 == 0));
        System.out.println("25 is odd number: " + (25 % 2 != 0 ));

        System.out.println("25 is even number: " + (25 % 2 == 0 ) );
        System.out.println("25 is even number: "+ !( 25 % 2 != 0));

        System.out.println("================================================");

        int num1= 46;
        int num2 = 90;
        int sum = num1+num2;
        System.out.println (num1 + " + " + num2 + " = " + sum);

        System.out.println("================================================");

        int celcius = 50;
        int fahrenheitInCelcius = 9*celcius/5+32;
        System.out.println (fahrenheitInCelcius);

        System.out.println("================================================");

        int mile = 1000;
        double km = mile * 1.609344;
        System.out.println(km);

        System.out.println("================================================");

        double r1 = 5.5;
        double pi = 3.14;
        double perimeter = 2 * r1 * pi;
        double area = r1 * r1 * pi;
        System.out.println (perimeter);
        System.out.println(area);











    }
}
