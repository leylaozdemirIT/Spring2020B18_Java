package day48_Abstraction.warmup;

public class PhoneObjects {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X",1000,"10 inches");
        Iphone iphone2 = new Iphone("9",900,"8 inches");

        System.out.println(iphone1);
        System.out.println(iphone2);

        iphone1.FaceTiming(123456);
        iphone1.calling(911);
        iphone1.texting(12345);
        // iphone1.freezing();

        System.out.println("=============================");
        Samsung samsung1 = new Samsung("Note10 plus",1200,"Large");
        System.out.println(samsung1);

        samsung1.calling(123456);
        // samsung1.FaceTiming();
        samsung1.freezing();
        samsung1.texting(45678);
    }
}
