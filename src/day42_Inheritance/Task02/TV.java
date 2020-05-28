package day42_Inheritance.Task02;

public class TV extends Device{

    /*
    brand (Inherited)
    model (Inherited)
    price (Inherited)
    country (Inherited)
    type (Inherited)

    watch
    toString (Inherited)
     */
    public void watch(){
        System.out.println("We are watching "+brand+" TV");
    }
    public TV(String brand, String model, double price, String country, String size){
        setDevice(brand,model,price,country,"TV",size);
    }
}
