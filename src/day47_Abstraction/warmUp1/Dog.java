package day47_Abstraction.warmUp1;

public class Dog extends Pets{

    public Dog(String name, int age, String color, String breed, char gender){
        super.setInfo(name,age,color,breed,gender);
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    public void speak() {

    }
}
