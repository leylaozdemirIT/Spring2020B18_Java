package day47_Abstraction.warmUp1;

public class Tiger extends Pets {

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void speak() {

    }

    public Tiger(String name, int age, String color, String breed, char gender) {
        super.setInfo(name, age, color, breed, gender);

    }
}
