package day40_Encapsulation;

public class Person_Objects {
    public static void main(String[] args) {
        Person Zarina = new Person("Zarina");
        //System.out.println(Zarina.SSN);

        Zarina.setSSN(123456);
        System.out.println("Zarina' SSN: " + Zarina.getSSN());

        // System.out.println( Zarina.ID);

        Zarina.setID(456);
        System.out.println( "Zarina' ID: " + Zarina.getID()); // right now it is 0. because not set yet
    }
}
