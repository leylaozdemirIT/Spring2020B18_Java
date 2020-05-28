package day42_Inheritance;

class Test{

    public Test(){
        System.out.println("A");
    }
}

public class Constructor extends Test{

    public Constructor(){
        System.out.println("B");
    }

    public static void main(String[] args) {

        Constructor obj = new Constructor(); // A B
        //they have super&sub relationship. So when we call the obj from sub class,
        // first super class and sub class constructors get executed

        System.out.println("=======================");

        Test obj1 = new Test(); // A
        //we called the obj from super class,so sub class is not executed

    }
}
