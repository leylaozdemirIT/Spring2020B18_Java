package day05_Unary_ShorthandOperators;

public class UnaryOperators {

    public static void main(String[] args) {

        int a = 10; // positive 10
        int b = +a; // positive 10

        System.out.println(a);
        System.out.println(b);

        int a2= -10;
        boolean result1 = a2 > 0;
        boolean result2 = a2 < 0;
        System.out.println (result1);
        System.out.println(result2);

        System.out.println("============================================================");

        int x1 = -10;
        int y1 = -x1;
        System.out.println(x1);
        System.out.println(y1);

        System.out.println("============================================================");

        int z = 100;
        System.out.println(++z);
        System.out.println(z);

        System.out.println("=============================================================");

int P = 100;

        System.out.println(P++);
        System.out.println(P);
    }

}