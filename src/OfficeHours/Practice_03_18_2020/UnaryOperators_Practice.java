package OfficeHours.Practice_03_18_2020;

public class UnaryOperators_Practice {

    public static void main(String[] args) {
        // post: first passes the current value, then increase/decrease by 1
        int a =20;
        System.out.println(a++); // 20
        System.out.println(a); // 21

        int b = 30;
        int c = b--; // c = 30; b = 29
        System.out.println(b); // 29
        System.out.println(c); // 30

        int d = 40;
        int e = d++; // e = 40, d = 41
        System.out.println(e); // 40
        System.out.println(d); // 41


        // pre : changes the value immidiately
        int x = 200;
        System.out.println(--x); // 199
        System.out.println(x); // 199

        int z = 100; // 101, 100, 99, 100
        z = z++ + --z + -z-- + ++z;
        // z = 100 + 100 + -100 + 100
        System.out.println(z);

        int u = 900; // 901, 902, 903
        int r = - ++u + ++u + -u++; // - 901 + 902 + -902
        System.out.println(r);
        System.out.println(u);







    }
}
