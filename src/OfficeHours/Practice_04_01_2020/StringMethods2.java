package OfficeHours.Practice_04_01_2020;

public class StringMethods2 {
    public static void main(String[] args) {
        //isEmpty(): checks if the string is empty, if empty True, if not False. Returns boolean
        String str1 = " ";

        boolean r1 = str1.isEmpty(); // false
        boolean r2 = !str1.isEmpty(); // true

        //equals(str) : checks if the two string of texts are equal or not,returns boolean
        //equalsIgnoreCase: checks if two strings are equal without case sensitivity
        String s1 = "cat";
        String s2 = new String("cat");
        String s3 = "Cat";

        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2) ); //true

        System.out.println(s3.equals(s1)); // false, case sensitivity
        System.out.println(s3.equalsIgnoreCase(s1));

        System.out.println("===============================");
        // contains(str): checks if the str is included in the string, returns boolean

        String sentence = "I like to learn Java";

        System.out.println(sentence.contains("Java")); //true

        String sentence2 = "Top 3 viruses are: 1.Corona 2.Hanta 3.Ebola";

        System.out.println(sentence2.contains("Java")); // false
        System.out.println("====================================");

        // startsWith(str): checks if the string started with given str
        // endsWith(str):checks if the string ends with given str

        String webaddress = "www.amazon.com";

        System.out.println(webaddress.startsWith("www")); //true
        System.out.println(webaddress.startsWith("wwww")); // false

        String gmail = "CybertekSchool@gmail.com";

        System.out.println(gmail.endsWith("@gmail.com")); //true

        System.out.println(gmail.endsWith("@hotmail.com")); //false

        System.out.println(gmail.endsWith("@coldmail.com")); // false




    }
}
