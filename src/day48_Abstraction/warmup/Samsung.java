package day48_Abstraction.warmup;

public class Samsung extends Phone{
    @Override
    public void calling(long phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Texting "+phoneNumber);
    }
    public void freezing(){
        System.out.println("Samsung is freezing when using");
    }
    public Samsung(String model,double price,String size){
        this.model=model;
        this.price=price;
        this.size=size;
    }
    static{
        brand = "Samsung";
    }
}
