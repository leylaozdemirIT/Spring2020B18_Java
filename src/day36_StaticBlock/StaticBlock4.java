package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock4 {

    static String name;
    static Tester tester1 = new Tester();

    int insVariable;


    static { // designed for statics ONLY
        // gets executed as soon as the class is loaded
        // designed to initialize static variables
        name = "Cybertek School";
        tester1.setTesterInfo("Muhtar", 123, "SDET", 1200000);
        tester1.setTesterInfo("Namık", 1245, "SDET", 120000);

    }
       /*
       StaticBlock4 obj1 = new StaticBlock4(); // this is the only way to call instance
        obj1.insVariable = 300;  // variables within static - DO NOT USE static block
        to initialize instance variables
       */

    public static void main(String[] args) {
        System.out.println(name); // Cybertek School

        System.out.println(tester1); // Namık,...etc

        StaticBlock4 obj2 = new StaticBlock4();
        System.out.println( obj2.insVariable ); // will print 0
    }
}
