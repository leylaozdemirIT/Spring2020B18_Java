package Resources;

import day40_Encapsulation.Encapsulation;

public class Encapsulations_Test {

    public static void main(String[] args) {
        Encapsulation obj1 = new Encapsulation();

        Encapsulations_Test obj2 = new Encapsulations_Test();
        // obj2.SSN = 1000;

        // System.out.println(obj1.SSN);

        obj1.setSSN(156789);

        System.out.println(obj1.getSSN());
    }




}
