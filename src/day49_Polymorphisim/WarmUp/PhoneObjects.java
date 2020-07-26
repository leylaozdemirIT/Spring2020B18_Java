package day49_Polymorphisim.WarmUp;

public class PhoneObjects {

    public static void main(String[] args) {
        Iphone phone1 = new Iphone("iPhone X Pro",1000.50, "10 inches");
        System.out.println(phone1);
        phone1.calling(123456);
        phone1.texting(911);
        phone1.faceTiming(789);
        phone1.download();

        Nokia nokia1 = new Nokia("S60",700,"8 inches");
        System.out.println(nokia1);
        nokia1.breakTheFloor();
        nokia1.calling(456789);
        nokia1.download();
        nokia1.freezing();
        nokia1.texting(911);

    }
}
