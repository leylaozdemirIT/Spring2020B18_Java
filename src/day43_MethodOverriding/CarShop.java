package day43_MethodOverriding;

public class CarShop {

    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        tesla.start();

        System.out.println("=========================");

        Honda honda = new Honda();
        honda.start();

        System.out.println("==========================");

        Jeep jeep = new Jeep();
        jeep.start();

        System.out.println("==========================");

        BMW BMW1 = new BMW();
        BMW1.start();
    }
}
