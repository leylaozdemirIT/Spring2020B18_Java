package day38_Constructors__repeat;
public class dogJobjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        System.out.println( dog1.name ); // unknown
        System.out.println( dog1.breed ); // unknown
        System.out.println( dog1.age ); //0

        System.out.println("=============================");

        Dog dog2 = new Dog("Husky");
        System.out.println( dog2.name ); // unkown
        System.out.println( dog2.breed ); // Husy
        System.out.println( dog2.age ); //0

        System.out.println("=============================");

        Dog dog3 = new Dog("Poodle", 4);

        System.out.println( dog3.name );
        System.out.println( dog3.breed ); // poodle
        System.out.println( dog3.age ); // 4

        System.out.println("==========================================");

        System.out.println(dog3);
        System.out.println( dog2 );
        System.out.println(dog1);

        System.out.println("============================");

        //  Dog dog4 = new Dog(5 , "Husky");

    }
}