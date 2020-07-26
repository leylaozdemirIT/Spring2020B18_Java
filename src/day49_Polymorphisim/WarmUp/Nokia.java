package day49_Polymorphisim.WarmUp;
/*create a class named Nokia that can inherit from AndroidApps interface
actions that Nokia can do: texting(), calling(), freezing(), breakTheFloor()*/
public class Nokia extends Phone implements AndroidApps{

    @Override
    public void download() {
        System.out.println("Nokia is downloading apps from "+AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Nokia is texting to "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Nokia is calling to "+phoneNumber);
    }
    public void freezing(){
        System.out.println("Nokia is freezing");
    }
    public void breakTheFloor(){
        System.out.println("Nokia can break the floor");
    }
    static{
        brand = "Nokia";
    }
    public Nokia(String model,double price,String size){
        this.model=model;
        this.price=price;
        this.size=size;
    }
}
