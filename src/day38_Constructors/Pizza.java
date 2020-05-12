package day38_Constructors;
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
    int numberOfCheeseTopping;
    int numberOfPepTop;
    double cost;

    public Pizza (String size,int numberOfCheeseTopping, int numberOfPepTop){
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepTop = numberOfPepTop;
    }

    public void calcCost(){
        if (size.equalsIgnoreCase("small")){
            cost = 10 + (1.5 * numberOfPepTop)+(numberOfCheeseTopping);
        }else if (size.equalsIgnoreCase("medium")){
            cost = 15 + (1.5*numberOfPepTop) + (numberOfCheeseTopping);
        }else {
            cost = 14 + (1.5 * numberOfPepTop) + (numberOfCheeseTopping);
        }
    }

    public String toString(){
        return "pizza size: " + size +
                " number of CheeseTopping: "+numberOfCheeseTopping +
                " number of Pepperoni Topping: " + numberOfPepTop +
                " Total Cost: $" + cost;
    }

}
