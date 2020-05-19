package day39_AccessModifiers;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        Car car2 = new Car("Toyota","X5");
        Car car3 = new Car ("BMW","X5",2018);
        Car car4 = new Car ("Toyota","Corolla",2018,50000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }
}
