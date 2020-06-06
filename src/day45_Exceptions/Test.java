package day45_Exceptions;

class A{
    public A(){
        System.out.println("A");
    }
}
class B extends A{
    public B(){
        System.out.println("B");
    }
}

public class Test extends B {
    public Test() {
        // super();
        System.out.println("C");
    }

    int Inum = 10;

    public static void main(String[] args) {
        new Test(); // ABC

        Test obj1 = new Test(); // ABC
        obj1.Inum =20;

        Test obj2 = new Test(); // ABC
        System.out.println(obj2.Inum);
    }
}
