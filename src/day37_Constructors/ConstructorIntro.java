package day37_Constructors;

public class ConstructorIntro {

    public ConstructorIntro(int a) { // constructor with argument
        System.out.println("Constructor with int argument");
    }
    //public method(){ }// Constructor name must be same with class name
    public static void main(String[] args) {
        //ConstructorIntro obj = new ConstructorIntro(); // object MUST be created with existing constructor
        ConstructorIntro obj5 = new ConstructorIntro(10);

        ConstructorIntro obj6 = new ConstructorIntro(20);

    }

}



