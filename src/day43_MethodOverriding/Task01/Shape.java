package day43_MethodOverriding.Task01;
/*
calculateArea()
calculatePerimeter()
 */
public class Shape {

    public double area;
    public double perimeter;

    protected void calculateArea() {
        this.area = 0;
        System.out.println("Area of the shape is: " + area);
    }

    protected void calculatePerimeter() {
        perimeter = 0;
        System.out.println("Perimeter of the shape is: " + perimeter);
    }
}