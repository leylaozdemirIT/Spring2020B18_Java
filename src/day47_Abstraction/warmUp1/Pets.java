package day47_Abstraction.warmUp1;
/*1. create an abstract class called Pets
        attributes: name, age, color, breed, gender
        methods:
abstract methods: sleep, eat, speak
        instance method: toString
        2. create three sub classes (non-abstract) of pet:
        1. Dog
        2. Cat
        3. Tiger
        each class MUST have constructors to initialize the attributes*/
public abstract class Pets {

    String name;
    int age;
    String color;
    String breed;
    char gender;

    public void setInfo(String name,int age, String color, String breed, char gender){
        this.name = name;
        this.age = age;
        this.color= color;
        this.breed = breed;
        this.gender = gender;
    }

    public abstract void sleep();
    public abstract void eat();
    public abstract void speak();

    public String toString(){
        return "Dog Name: "+name+", breed: "+breed+", gender: "+gender+", color: "+color+" age: "+age;

    }


}
