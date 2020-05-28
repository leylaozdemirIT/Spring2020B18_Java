package day42_Inheritance.Task02;
/*create ba class called phone:
        attributes: brand, model, price, country, type
        methods: call, text,  toString*/
public class Phone extends Device{
/*
brand (Inherited)
model (Inherited)
price (Inherited)
country (Inherited)
type (Inherited)

setDevice() (Inherited)

call()
text()
toString() (Inherited)
 */

    public void call(long number){
        System.out.println("Calling the number: "+number);
    }
    public void text(long number){
        System.out.println("Texting to: "+number);
    }
    public Phone(String brand, String model, double price,String country, String size){
        setDevice(brand,model,price,country,"Phone",size);
    }
}
