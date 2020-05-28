package OfficeHours.Practice_05_20_2020;

public class Dog extends Pet{
    /*
    variables: name, age, color, size, breed, isPet, numberOfEyes
    methods: eat, sleep, drink, toString, bark
     */

    public Dog(String name, int age, String color, String size, String breed){
        setInfo(name, age, color, size, breed);
    }




    public void Dog(){
        System.out.println(name + " is barking");
    }
}
