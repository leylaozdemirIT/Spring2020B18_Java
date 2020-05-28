package day38_Constructors__repeat;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
        System.out.println("Default constructor");
    }
    public ConstructorCalls2(int a){
        this(); // calls the Default constructor
        System.out.println("Constructor with int argument");
    }
    public ConstructorCalls2(String str){
        this(10); // default, & int arguments
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        ConstructorCalls2 obj = new ConstructorCalls2("Hello");

    }
    public void method1(){

    }

    {

    }
}
