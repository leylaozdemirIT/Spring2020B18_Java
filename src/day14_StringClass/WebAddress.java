package day14_StringClass;
/*write a program that can validate if a web address is valid

        valid web address:
        MUST start with www.
        MUST end with .com or .edu or .gov or .net
         */
public class WebAddress {
    public static void main(String[] args) {
        String website = "www.maryland.edu";
        website = website.toLowerCase();

        boolean validEnding = website.endsWith(".com") || website.endsWith(".edu") ||
                website.endsWith(".gov)");
        if (website.startsWith("www.") && validEnding ){

        System.out.println("It is a valid web address");
            }else{
                System.out.println("It is NOT a valid web address");
            }



        }}




