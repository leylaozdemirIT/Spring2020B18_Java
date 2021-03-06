package day35_Static;

public class staticVariables2 {

    int  insVariable;    // every single object of the class has its own copy of instances
    static int staticVariable;   // there is only one copy of static shared by all objects

    public static void main(String[] args) {

        staticVariables2 obj1 = new staticVariables2();
        obj1.insVariable = 300;
        staticVariables2.staticVariable = 400; // statics prefer to be called through class name
        obj1.staticVariable = 400; // it works if you call it through obj name too

        staticVariables2 obj2 = new staticVariables2();


        System.out.println(   obj1.insVariable  ); // 300
        System.out.println( obj2.insVariable );   //0

        System.out.println();

        System.out.println(  obj1.staticVariable );  // 400
        System.out.println( obj2.staticVariable );

        System.out.println();

        System.out.println( staticVariables2.staticVariable ); // static can be called through class name
        //System.out.println( staticVariables2.insVariable ); // instance CAN NOT be called through class name


    }


}