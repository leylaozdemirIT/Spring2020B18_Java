package OfficeHours.Practice_05_20_2020;

public class Pet {
/*
variables: name, age, color, size, breed, isPet, numberOfeyes
methods: eat, sleep, drink, toString
 */
protected String name;
protected int age;
protected String color;
protected String size;
protected String breed;

protected static boolean isPet = true;
protected static int numberOfEyes = 2;

public void setInfo(String name, int age, String color, String size, String breed){
    this.name = name;
    this.age = age;
    this.breed = breed;
    this.color = color;
    this.size = size;
}

public void eat(String food){
    System.out.println(name + " is eating "+food);
}
public void sleep(){
    System.out.println(name +" is sleeping");
}
public void drink(){
    System.out.println(name + " is drinking ");
}
public String toString(){
    return "name" + ", age "+age+",  color "+color+", size "+size+", breed "+breed;
}
}

