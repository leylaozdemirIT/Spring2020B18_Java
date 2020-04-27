package day14_StringClass;

public class practice {

    public static void main(String[] args) {
        String gmail = "cybertekschool@gmail.com";

        String userinputGmail = "CybertekSchool@gmail.com";

        boolean result = gmail.equalsIgnoreCase(userinputGmail); // true
        // gmail.equals(userinputGmail) - false

        if (result){
            System.out.println("Logged in");
        }
        System.out.println("=======================================");
        /* valid password MUST contain a special characters such as (!,_,$)
        valid password should not contain spaces
         */
        String PassWord = "mmasd1235";

        if (PassWord.contains(" ")){
            System.out.println("Password can not contain spaces");
        }else {
            System.out.println("valid password");
        }
        System.out.println("=======================================");
        /*
        every website has "www." at the beginning of the web address
        */
        String webAddress = "Www.amazon.com";
        // webAddress = webAddress.toLowerCase(); we convert it to lower case

        if (webAddress.startsWith("www.") ){
            System.out.println("Valid website");
        }

        /*every single gmail address ends with @gmail.com*/

        String email = "CybertekSchool@yahoo.com";

        if (email.endsWith("@gmail.com") ){
            System.out.println("valid gmail");
        }else {
            System.out.println("Invalid gmail");
        }
        System.out.println("============================================");

}}
