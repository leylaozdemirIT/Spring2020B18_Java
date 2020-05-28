package day38_Constructors__repeat;

public class ConstructorCalls3 {

    public ConstructorCalls3(){
        //this(9); // int argument
        System.out.println("default");
         // this(9); // int argument - needs to be at 1st line
    }
    public ConstructorCalls3(int a){
        // this(10); - constructor can not call itself
        this();
        System.out.println("Int argument");
    }

    public ConstructorCalls3(String str){

    }

    public static void main(String[] args) {
        ConstructorCalls3 obj = new ConstructorCalls3();

    }

    public void method1(){

    }

}
