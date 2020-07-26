package day33_CustomClass;

public class CarObjects {
    public static void main(String[] args) {
      Car car1 = new Car();
      car1.Brand = "BMW";
      car1.model = "X5";
      car1.color = "red";
      car1.year = 2005;

        System.out.println(car1.Brand); // instance variables are object variables, we can call them through object name
        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.year);

        car1.start();
        car1.drive();

      car1.getCarInfo();

        System.out.println("=========================");

        Car car2 = new Car();
        car2.Brand = "Toyota";
        car2.model = "Corola";
        car2.color = "Black";
        car2.year = 2002;

        System.out.println(car2.Brand);
        System.out.println(car2.model);
        System.out.println(car2.color);
        System.out.println(car2.year);

        car2.start();
        car2.drive();
        car2.getCarInfo();

      System.out.println("===================================");

      Car car3 = new Car();
      car3.Brand = "Ford";
      car3.model = "Explorer";
      car3.color = "White";
      car3.year = 2017;

      car3.getCarInfo();
      car3.start();
      car3.drive();

      System.out.println("============================");

      String str = "A";
      String str2 = "B";

      String [] arr = {str, str2};

      Car [] cars = {car1, car2, car3};
      cars[0].getCarInfo();
      cars[1].getCarInfo();
      cars[2].getCarInfo();








    }
}
