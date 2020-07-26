package day47_Abstraction;

final class Test1{
    public Test1(){ }
    public void method1(){ }
    public static void method2(){ }
    // public abstract void method3(); - you can not have abstract method in regular class

    int a = 100;
    static int b = 200;

    {

    }
    static{

    }

}

abstract class Test2 { // abstract class can not be final - can not create object
    public Test2() {
    }

    public void method1() {
    }

    public static void method2() {
    }

    public abstract void method3();

    int a = 100;
    static int b = 200;


    {
        //Test2 obj = new Test2() {
    }

        static {

    }

}

public class Abstract_VS_NonAbstract {

}