package day50_PolymorphisimContinue;

public class Inheritance {
    public int publicInt = 100;
    protected int protectedInt = 200;
    int defaultInt = 300;
    private int privateInt = 400;


}
class Data extends Inheritance{
    public static void main(String[] args) {
        Data data1 = new Data();
        System.out.println( data1.publicInt);
        // System.out.println( data1.privateInt); // private is not inherited
        System.out.println( data1.protectedInt );
        System.out.println( data1.defaultInt ); //we can call it in the same package, but not outside package

    }


}