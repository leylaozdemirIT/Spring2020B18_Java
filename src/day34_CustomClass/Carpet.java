package day34_CustomClass;

public class Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public void customOrder(double width, double length, double unitPrice, boolean isPersian){
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
    public double calcCost(){
        double total = (width+length)*unitPrice;
        if (isPersian){
            return total +=200;
        }else{
            return total;
        }
    }

    //return  (isPersian) ?  total+200 : total;




    // (w+l)*unitPrice

    public String toString(){
        return "width: "+width+
                "\nlength: "+length+
                "\nunit price $"+unitPrice+
                "\ncosts $"+calcCost();
    }

}