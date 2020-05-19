package day41_Inheritance.Task01;

public class EmployeeObjects {

    public static void main(String[] args) {

        Developer dev1 = new Developer("Namik","Software Developer",'M',120000,123);

        dev1.coding();
        dev1.fixingBug();

        System.out.println(dev1);

        Tester tester1 = new Tester("Hilal",120005,456,"SDET",'F');

        tester1.reporting();
        tester1.testing();

        System.out.println(tester1);

        BusinessAnalyst BA1 = new BusinessAnalyst("Ozgur",120002,789,'M');

        BA1.writingRequirements();
        BA1.gathering();

        System.out.println( BA1 );
    }
}
