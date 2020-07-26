package day48_Abstraction.warmup;

public class Iphone extends Phone{

    static{
        brand = "iphone";
    }
    public Iphone(String model, double price, String size){
        this.model=model;
        this.price=price;
        this.size=size;
    }
    public void FaceTiming(long phoneNumber){
        System.out.println("iphone is facetiming with "+phoneNumber);
    }
    @Override
    public void calling(long phoneNumber) {
        System.out.println("iphone is calling "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("iphone is texting "+phoneNumber);
    }
}
