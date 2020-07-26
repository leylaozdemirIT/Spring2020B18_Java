package day49_Polymorphisim;

class Animal extends Robot{

}

class Dog extends Animal{

}
class Cat extends Animal{

}

class Robot{

}

public class Polymorphisim_Intro {

    public static void main(String[] args) {

        //Animal obj = new Animal(); //interface & abstract can not be in object type
        Animal obj2 = new Dog(); // abstract class(Animal) has to be in ref type-left - not object type
        Animal obj3 = new Cat();

        // Dog obj4 = new Cat();
        Dog obj5 = new Dog();
        Cat obj6 = new Cat();

        Robot obj7 = new Robot();

        //Animal [] animalShow = {obj2, obj3, obj5, obj6,obj7};

        Robot obj8 = new Animal();
        Robot obj9 = new Dog();
        Robot obj10 = new Cat();

        Robot [] robots = {obj8,obj9,obj10};
    }
}
