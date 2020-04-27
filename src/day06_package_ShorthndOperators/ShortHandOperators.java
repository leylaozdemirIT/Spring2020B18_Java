package day06_package_ShorthndOperators;

public class ShortHandOperators {

    public static void main(String[] args) {
        int x = 20;
        x += 10; // x = x +10 = 30

        System.out.println(x);
        x += 60; // x = x + 60 = 90

        System.out.println(x);

        String schoolname = "Cybertek";
        schoolname += 12345; // schoolname = schoolname + 12345
        System.out.println(schoolname);

        System.out.println('a' + 'b'); //97 + 98 = 195

        char ch1 = 'a';
        ch1 += 'b';
        // char ch1 = 195; the character will be assigned to the char
        System.out.println(ch1); //character

        int num = 'z'; //it will accept the number 122
        num += 'x'; // 122 + 120 (x value)
        // num = 122 + 120 = 242
        System.out.println(x);

        int A = 100;
        A -= 90;
        System.out.println(A);

        int B = 200;
        B -= A; // B = 200 - 10
        System.out.println(B);

        int a = 2;
        a *= 3;
        System.out.println(a);

        System.out.println("========================================================");

        int b = a *= 10;
        // b = a = a * 10;
        System.out.println(b);
        System.out.println(a);

        int a1 = 100;
        int b1 = (a1 *= 2) + ++a1;
        // b1 = 200  + 201
        // b1 = 401
        System.out.println(b1);

        int x1 = 10;
        int y = x1 += 10*2; //x1 += 20
        // x1 = 10 += 20 ==> 30
        System.out.println(y);

        int q =20;
        int p = q*=20*3;
        // p = q * 60

        int num1 = 300;
        num1 /= num1 / 2; //num 1 = 300 / 2

        System.out.println(num1);

        int num2 =400;
        num2 /= 20 + 10; //num2 = num2 / 30
        // num2 = 400 / 30       13.123
        // num = 13
        System.out.println(num2);

        int num3 = 300;
        num3 %= 10+20;
        // num3 %= 30
        // 300 %= 30
        // 0
        System.out.println(num3);

        int n1= 400;
        n1 %= 3*5;
        // 400 %= 15
        // division is 26.666, 400-(26*15) = 10 remainder is 10
        System.out.println(n1); //10



















    }




}
