package day38_Constructors;

public class ConstructorCalls {

    public ConstructorCalls(){
        method1(); // constructor can call other methods - all
        method2(); // constructor can call other methods - all
    }
    public ConstructorCalls(int a){
        //ConstructorCalls();
        this();
    }
    public static void method1(){
        //method2(); - static only accepts static
        //ConstructorCalls();
    }
    public void method2(){
        method1();
    }
}
