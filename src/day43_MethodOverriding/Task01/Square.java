package day43_MethodOverriding.Task01;

public class Square extends Shape{

    public double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public void calculateArea(){
        area = side * side;
        System.out.println("Area of the square: "+area);
    }
    public void calculatePerimeter(){
        perimeter = 4 * side;
        System.out.println("Perimeter of the square: "+perimeter);
    }
}
