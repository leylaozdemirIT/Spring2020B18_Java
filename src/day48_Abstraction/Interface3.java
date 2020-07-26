package day48_Abstraction;

public interface Interface3 {

    public abstract void method1();
    public abstract void method2();

    static final int num = 100; // by default public
    int num2 = 300; // by default : public static final

    public static void main(String[] args) {
        Interface3.method3();
        System.out.println(Interface3.num2);//if the class was abstract,it would not compile
        //because in abstract class, you have to give the access-modifier.If you do not give,it is default by default7
        System.out.println(Interface3.num);
    }
    static void method3(){//static method can not be abstract,so we give the body

    }
}
