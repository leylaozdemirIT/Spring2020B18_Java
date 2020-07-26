package day48_Abstraction;

public interface Interface2 {

    /*  public Interface2(){ } - constructors belong to object,come from class.interface
    is not a class. So,we can not have it
    */

    // public void method1(){ }-can not have instance methods.The same reason above

    // { }-instance block can not have.
   /* static{
        we can not have static block.Because static var is final.We can not re-initialize them
    }*/

    int a = 100; //because it is final & static,needs to be initialized

    public static void main(String[] args) {
        System.out.println(a);// by default static
        //  a = 200; // by default final

        System.out.println( Interface2.a );
        Interface2.method4();

    }

    static void method4(){ }

    void method5();

    default void method6(){
        System.out.println("Default method");
    }


}