package day51_Recap.WarmUp;

import java.util.ArrayList;
import java.util.Arrays;

/*create a class named ShapeObjects
                1. create two circle and two Cylinder' objects
                2. create an ArrayList that can contain  all those objects
                        */
public class ShapeObjects {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);

        Cylinder cylinder1 = new Cylinder(5,4);
        Cylinder cylinder2 = new Cylinder(4,8);

        ArrayList<Shape>list = new ArrayList<>();
        list.addAll(Arrays.asList(circle1,circle2,cylinder1,cylinder2));

        Shape shape1 = circle1; // upcasting
        Shape shape2 = new Cylinder(3,6);
        ( (Cylinder)shape2 ).calculateVolume(); // downcasting we need to do it manually

        for (Shape eachShape: list){
            System.out.println( eachShape.name + " : "+ eachShape.calculateArea() );
        }

        System.out.println("=======================================");

      //  list.get(2).calculateVolume(); // reference type is Shape, Shape does not have calculateVolume

       double d =  ( (Cylinder) list.get(2) ).calculateVolume();
        System.out.println(d);

        //list.get(1).calculateVolume(); //ref is Shape, Shape does not have calculateVolume method

        //( (Cylinder)list.get(1) ).calculateVolume(); // IS A relation is the precondition of reference casting
        // circle cannot be referenced by cylinder

        Shape s1 = new Circle(6);
        //System.out.println( s1.radius ); -in Shape you do not have radius
        Circle c1 = (Circle)s1;
        System.out.println( ( (Circle)s1 ).radius);
        System.out.println( c1.radius );
    }
}
