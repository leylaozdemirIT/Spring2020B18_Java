package day50_PolymorphisimContinue;

import day50_PolymorphisimContinue.Animal;
import day50_PolymorphisimContinue.Dog;

public class AnimalObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Latte",3,"female");
        System.out.println(dog1.dogName);
        dog1.bark();

        Animal obj2 = new Dog("Kito",6,"female");
        //System.out.println(obj2.dogName);-dog name does not exist in Animal class
        //obj2.bark();-bark method is not in animal class
        obj2.eat();//if method is overriden in subclass,object method will be called,otherwise ref method
        obj2.methodA();

        Animal animal1 = new Cat("A","F",1);
        boolean isCat = animal1 instanceof Cat;
        System.out.println(isCat);

        Dog d1 = new Dog("A",1,"F");
        // boolean r1 = d1 instanceof Cat; // there is no IS A relation between Dog and Cat

        Animal animal2 = new Cat("Q","f",2);

        boolean r2 = animal2 instanceof Dog;
        System.out.println(r2);

    }
}
