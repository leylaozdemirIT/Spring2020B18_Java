package day46_final_abstract.Shapes;

import day46_final_abstract.Shapes.shape;

public class Triangle extends shape {

    double height;
    double base;

    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }
    public void Area(){
        double area = base * height;
        System.out.println("Area of Triangle is: "+area);
    }
}
