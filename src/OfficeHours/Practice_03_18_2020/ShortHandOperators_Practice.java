package OfficeHours.Practice_03_18_2020;

public class ShortHandOperators_Practice {

    public static void main(String[] args) {
        // += addition assignment

        int a = 100;
        // a = a + 200;
        a += 200;

        System.out.println(a); // a=300

        a += 200 * 3; // a (300) + 600 = 900
        System.out.println(a);

        // -= substraction assignment
        a -= 400; // a = a- 400 - now a value is 900 - 400 = 500

        System.out.println(a);

        // *= multiplication assignment
        int x = 5;
        x *= 3; // instead of writing x = x* 3
        System.out.println(x);

        x *= 2+1;
        // x *= 3; x = x * 3

        System.out.println(x);

        int n =900;
        // n = n / 3;

        n /= 3;

        System.out.println(n);

        n /= 3 * 5; // n = n / 15 ==> 20

        System.out.println(n);

        int m =10;
        m %= 3;
        System.out.println(m);

        int y = 300;
        y %= 3*5; // y ==> 300 % 15 ==> 0
        System.out.println(y);

        int t = 400;
        t %= 10*2; // 400 %= 20 ==> 0
        System.out.println(t);











    }
}
