package day50_PolymorphisimContinue;

public abstract class Animal { // 2 var, 2 in method

    public int age;
    public String gender;

    public void eat(){
        System.out.println("Animal is eating");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    public static void methodA(){
    System.out.println("Animal Class");
    }

}