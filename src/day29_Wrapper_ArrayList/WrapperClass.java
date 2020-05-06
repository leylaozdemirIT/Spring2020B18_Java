package day29_Wrapper_ArrayList;

public class WrapperClass {

    public static void main(String[] args) {

        int a = 100; //primitive

        Integer b = a; // wrapper class

        short s1 = 200;
        int n1 = s1;

        // Integer N1 = s1; // integer is dedicated to int primitive
        Integer N2 = n1;

        System.out.println("===========================");
        int a1= 20;
        float f1 = a1;

        // Float f2 = a1; // Float is dedicated to float primitive
        Float f3 = f1;

        Integer I1 = 200;
        int a2 = I1; // unboxing

        Byte B1 = 126;
        int a3 = B1; // unboxing

        System.out.println(a3);





    }
}
