package day42_Inheritance.Task02;

public class Device {

    public String brand;
    public String model;
    public double price;
    public String country;
    public String type;
    public String size;

    public String toString(){
        return "Brand: "+brand+", Model: "+model+", Type: "+type+", size: "+size+", Price: $"+price+", Made in: "+country;
    }
    public void setDevice(String brand, String model, double price, String country, String type, String size){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.country = country;
        this.type = type;
        this.size = size;
    }
}
