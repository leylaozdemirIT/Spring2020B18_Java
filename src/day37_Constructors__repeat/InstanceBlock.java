package day37_Constructors__repeat;

public class InstanceBlock {

    static{
        System.out.println("static block");
    }

    {
        System.out.println("Instance Block1");

    }

    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();

        InstanceBlock obj2 = new InstanceBlock();
    }

    {
        System.out.println("Instance Block2");
    }



}
