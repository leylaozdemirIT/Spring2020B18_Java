package day33_CustomClass__SATURDAY;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects2 {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setCarInfo("BMW", "X6", 2020, "White");
        car1.getCarInfo();

        Car car2 = new Car();
        car2.setCarInfo("Toyota", "Corolla", 2020, "Red");
        /*
        car2.Brand = "Toyota";
        car2.model = "Corolla";
        car2.year = 2020;
        car2.color = "Red";
         */

        car2.getCarInfo();

        Car car3 = new Car();
        car3.setCarInfo("Audi", "Q7", 2019, "Gray");
        car3.getCarInfo();

        System.out.println("======================================================");

        Car[] cars = {car1, car2, car3};

        for (Car each : cars){
            each.getCarInfo();
        }
        System.out.println("======================================================");

        for (int i = 0; i<=cars.length - 1; i++){
            cars[i].getCarInfo();
        }

        System.out.println("===========================");

        System.out.println( car1 );

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println( list1 );  // toString method gets executed automatically
/*
If you do not have the toString method in the custom class that you have created, than
you will not be able to print the result
 */
        ArrayList<Car> each = new ArrayList<> (Arrays.asList(car1,car2,car3));
        System.out.println(each);






        //String[] arr = {"A", "B", 123};






    }
}