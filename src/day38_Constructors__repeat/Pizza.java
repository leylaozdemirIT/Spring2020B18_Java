package day38_Constructors__repeat;
/*create a custom class for pizza that should contain the following:
        instance variables:
        size (either small, medium, large)
        number of cheese topping
        number of pepperoni toppings
        Add a constructor that can allow user to set the size and toppisngs of the pizza
        instance method:
        calcCost(): returns the total cost as double
        toString(): a String return method that's containing the pizza' size, quantity of each topping, and the pizza cost as calculated by calcCost()
        Pizza cost is determined by:
        Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
        Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
        Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping
        create a class called Order
        create five objects of the pizza
        create an arraylist of pizza and add those 5 objects into it
        calculate the total price of the order (use for each loop)*/

public class Pizza {
    String size;
    int noOfCheeseTopping;
    int noOfPepTop;
    double cost;

    public Pizza (String size,int noOfCheeseTopping, int noOfPepTop){
        this.size = size;
        this.noOfCheeseTopping = noOfCheeseTopping;
        this.noOfPepTop = noOfPepTop;
    }

    public double calcCost(){
        if (size.equalsIgnoreCase("small")){
            return 10 + (1.5 * noOfPepTop)+(noOfCheeseTopping);
        }else if (size.equalsIgnoreCase("medium")){
            return 15 + (1.5*noOfPepTop) + (noOfCheeseTopping);
        }else {
            return 14 + (1.5 * noOfPepTop) + (noOfCheeseTopping);
        }
    }

    public String toString(){
        return "pizza size: " + size +
                " number of CheeseTopping: "+noOfCheeseTopping +
                " number of Pepperoni Topping: " + noOfPepTop +
                " Total Cost: $" + cost;
    }

}
