package day33_CustomClass__STARRT;
/*
cat class:
    data / attributes: instance variables
    breed, color, age, name

    actions : instance methods
    sleep(), eat (), drink ()
 */
public class Cat {

    String breed;
    String color;
    int age;
    String name;

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void eat(String catFood){
        System.out.println(name + " is eating "+catFood);
    }
    public void drink (String drink){
        System.out.println(name + " is drinking " + drink);
    }
    public void setCatInfo (String catBreed, String catColor, int CatAge, String CatName){
        breed = catBreed;
        color = catColor;
        age = CatAge;
        name = CatName;
    }
    public String toString (){
        return name + ", breed is " + breed + ", color is " + color + ", " + age + " years old";
    }


}