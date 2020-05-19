package day38_Constructors;
/*
instance variables:
name, unitPrice, quantity
add a constructor that can initialize the fields
instance methods:
calcCost(): returns the total cost as double
hint: quantity * unitPrice
toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */

public class Item {
    String name;
    int quantity;
    double unitPrice;

    public Item(String name, int quantity, double unitPrice){
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    public double calcCost(){
        return quantity * unitPrice;
    }
    public String toString(){
        return "Name: "+name + " Unit price: "+unitPrice + " Quantity: "+quantity+
                " Total cost: $ " + calcCost();
    }
}
