package day50_PolymorphisimContinue;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        int a = 100;
        double b = a; //implicit casting. done automatically

        Dog dog = new Dog("Lucy",5,"F");
        Animal animal1 = (Animal) dog; //upcasting, done implicitly

        Cat cat = new Cat("r","female",4);
        Animal animal2 = (Animal) cat;
        System.out.println("===================================");

        double c = 10;
        int d = (int)c;

        Animal animal3 = new Dog("A",12,"F");

        Dog dog3 = (Dog) animal3; // downcasting, MUST be done manually

        Animal animal4 = new Cat("C","female",7);
        Cat cat2 = (Cat)animal4;
        System.out.println("======================================");

        Animal animal5 = new Dog("Lucy",3,"female");
        // animal5.bark();
        Dog dog2 = (Dog)animal5; // first way to do it
        dog2.bark();
        //second way of doing it
        ( (Dog)animal5 ).bark();

    }
}
