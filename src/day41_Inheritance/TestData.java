package day41_Inheritance;

import day41_Inheritance.Data;

public class TestData extends Data{

    public static void main(String[] args) {

        System.out.println( Data.a ); // import only lets you get access to variables and methods
        Data.method1();

        //System.out.println( TestData.a);
        // TestData.method1();

        System.out.println( TestData.a); // but when we inherit, we actually have these methods in the subclass
        TestData.method1();

    }
}
