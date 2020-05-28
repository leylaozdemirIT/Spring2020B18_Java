package day42_Inheritance;

public class Data {
    public static String publicData = "public"; // visible everywhere
    protected static String protectedData = "protected";
    // visible in same package, in subclass outside package
    static String defaultData = "default";
    private static String privateData = "private";
}
class testing extends Data{
    /*
    public, default, protected
     */

    public static void main(String[] args) {

        System.out.println(testing.defaultData);
        System.out.println(testing.protectedData);
        System.out.println(testing.publicData);
    //    System.out.println(testing.privateData);
    }
        }
