package day47_Abstraction.warmUp1;

public class Cat extends Pets{

    public Cat(String name, int age, String color, String breed, char gender){
        super.setInfo(name, age, color,breed, gender);
    }
    public void eat(){
        System.out.println(name + " is eating");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public void speak(){

    }
}
