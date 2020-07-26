package day46_final_abstract.Shapes;

import day46_final_abstract.Shapes.shape;

public class Square extends shape {

    public double side;

    public Square(double side){
        this.side=side;
    }
    public void Area(){
        double area = side * side;
        System.out.println("Area of Square: "+area);
    }

}
