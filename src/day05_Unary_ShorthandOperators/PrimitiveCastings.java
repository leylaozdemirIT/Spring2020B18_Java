package day05_Unary_ShorthandOperators;

public class PrimitiveCastings {

    public static void main(String[] args) {

        // implicit casting is done automatically
        int a = 10;
        long b = a; // implicit casting is done automatically

        // b = 10L;

        // int c = b; // b is still long datatype

        int a1 =100;
        long b1 = (long) a1; // manually doing the implicit casting

        // int c1 = b1;

        // Explicit casting
        int Inum = 100;
        byte Bnum = (byte)Inum;

        short Snum = (short) Inum;

        double Dnum = 5.5;
        float Fnum = (int)Dnum; // 5.0
        // Fnum = (int) 5.5
        // Fnum = 5
        // Fnum = 5.0

        System.out.println(Fnum);

        double D1 = 10.5;
        long L1 = (int) D1;

        System.out.println(L1);

        float F1 = 60.5f;
        int I1 = (int)F1;
        System.out.println(I1);

        long LargeNum = 99999999l;
        int intNum = (int)LargeNum;
        System.out.println(intNum);

        System.out.println("===========================================");

        char ch1 = 'a';
        System.out.println(ch1);

        short sh1 = (short)ch1;
        System.out.println(sh1);

        System.out.println("============================================");

        char ch2 = 23456;
        double dbl1 = ch2; //23456.0
        System.out.println(dbl1);

        int z1 = 10;
        double t1b = z1; // 10.0

















    }
}
