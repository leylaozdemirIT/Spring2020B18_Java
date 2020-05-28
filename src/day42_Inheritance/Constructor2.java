package day42_Inheritance;


class test{

    public test(int a){
        this(2.5); // C
        System.out.println("A");
    }

    public test(double a){
        System.out.println("C");
    }
}


public class Constructor2 extends test {


    public Constructor2(){
        super(10); // C A
        System.out.println("B");
    }
    public Constructor2(int a){
        super(5.5);
        System.out.println("D");
    }
    //this() - used for calling the constructor from current class
    // super() - used for calling the constructor from super class
    public static void main(String[] args) {

        test obj = new test(10);  // C A

        Constructor2 obj2 = new Constructor2(); // C A B

        System.out.println("==================================");

        Constructor2 obj3 = new Constructor2(); // C A B

        System.out.println("=========================");

        Constructor2 obj4 = new Constructor2(10); // C D

    }



}