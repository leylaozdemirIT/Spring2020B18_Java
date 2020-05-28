package day37_Constructors__repeat;

public class CarObjects {

    public static void main(String[] args) {
        Car car1 = new Car("Tesla", "S3", 2020, 100000);
        Car car3 = new Car("Toyota", "RAV4", 2020, 50000);
        System.out.println(car1);
        System.out.println(car3);

        Car car2 = new Car("Toyota", "Corolla", 2020, 32000);
        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.price);


        Car car4 = new Car("Ford", "Explorer", 2017, 30000);
        System.out.println(car4);


    }
}