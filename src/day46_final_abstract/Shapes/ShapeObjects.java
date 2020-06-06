package day46_final_abstract.Shapes;

public class ShapeObjects {

    public static void main(String[] args) {
        Circle obj = new Circle(3.5);
        obj.Area();

        Square obj1 = new Square(5.5);
        obj1.Area();

        Rectangle obj2 = new Rectangle(5,4);
        obj2.Area();
    }
}
