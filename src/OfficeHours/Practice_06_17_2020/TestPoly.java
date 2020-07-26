package OfficeHours.Practice_06_17_2020;

public class TestPoly {

    public static void main(String[] args) {
        //all of the objects will be Dog object

        Dog dog1 = new Dog();
        System.out.println(dog1.species);
        System.out.println(dog1.breeds);
        System.out.println(dog1.toString());
        dog1.jump();

        Animal dog2 = new Dog();
        System.out.println(dog2.species);
        System.out.println( ((Dog)dog2).breeds ); //this is how we fix the problem-we need to cast it
        System.out.println(dog2.toString());
        ((Dog)dog2).jump();

        Object dog3 = new Dog();
        //System.out.println(dog3.species);
        //System.out.println(dog3.breeds);
        System.out.println(dog3.toString());
        //dog3.jump();

        Jumpable dog4 = new Dog();

    }
}
