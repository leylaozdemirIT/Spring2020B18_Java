package day36_StaticBlock;

public class StaticBlock {



    public static void main(String[] args) {
        System.out.println("Main method executed");
        method1();
    }
    static{
        System.out.println("static block executed");
    }

    public static void method1(){
        System.out.println("Custom method executed");
    }
}
