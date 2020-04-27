package OfficeHours.Practice_04_01_2020;

public class StringMethods {
    public static void main(String[] args) {
        //charAt(index number): returns the char at the given index
        String str1 = "Java ";
        char ch1 = str1.charAt(3);
        System.out.println(ch1);

      char ch2 = str1.charAt(4); // out of range
        System.out.println(ch2);

        // length(): returns the number of chars in the string, as an int
      String str2 = "Cybertek School";

      int maxIndex = str2.length()-1;

      char ch3 = str2.charAt(maxIndex);
        System.out.println(ch3);
        System.out.println("===============================================");

        //concat(str) : concatenation
        String str3 = "Cybertek ";
        str3= str3.concat("School"); // we need to re-assign it.

        System.out.println(str3);

        String str4 = "Java";
        str4 = str4.concat(" is fun");

        System.out.println(str4);

        System.out.println("=============================================");
        // toLowerCase() & toUpperCase (): change the case of Strings to upper or lower case

        String str5 = "CYBERTEK";
        str5 = str5.toLowerCase();

        System.out.println(str5);

        String str6 = "muhtar";
        str6 = str6.toUpperCase(); // MUHTAR. you have to re-assign it.otherwise it will not change
        System.out.println(str6);
        System.out.println("==============================================");

        // trim():removes unused (white) spaces from the string

        String str7 = "        Cybertek";
        str7 = str7.trim();

        System.out.println(str7);
        System.out.println(str7.length() );

        String str8 = "            ";
        str8 = str8.trim();
        System.out.println(str8.length());

        System.out.println("=====================================");

        /* substring (beginning index, ending index): creates substring starting
        from beginning index till ending index(ending index is excluded)*/

        String sentence1= "I like Java";
        //                 012345678910
        // last index number = length()-1
        // as the last one is not included - you can write length() for the last index

        String word1 = sentence1.substring(7, sentence1.length());
        System.out.println(word1);

        String word2 = sentence1.substring(2,6);
        System.out.println(word2);

        String word3 = sentence1.substring(2,6) + sentence1.substring(7,sentence1.length() );
        System.out.println(word3);

        // substring (beginning index):creates the substring from beginning index till the end of the string

        String sentence2 = "I like to learn Java";
        //                  0123456789...
        String r1 = sentence2.substring(10); // will return "learn Java"
        System.out.println(r1);

        String r2 = "Java"; //JaVa
        //           0123
        String r3 = r2.substring(0,2); // Ja

        String r4 = r2.substring(2,3); //v
        r4 = r4.toUpperCase(); //V

        String r5 = r2.substring(3); //a

        String result = r3+r4+r5; //JaVa

        System.out.println(result);
        System.out.println("=================================================");

        /* replace (old str, new str): replaces all the matching ones, returns new str
        replaceFirst(old str, new str):replaces only the first matching one, returns new str
         */
        String str = "I like C#, C# is cool";
        str = str.replace("C#", "Java");

        System.out.println(str);

        String t1 = "Java is fun, Java is good";
        t1 = t1.replaceFirst("Java", "C#");
        System.out.println(t1);

        System.out.println("================================================");

        /*indexOf(str): returns the index of first matching character, as an int
        lastIndexOf: returns the index of the last matching character, as an int
         */
        String y1 = "Today is Wednesday";
        int a1 = y1.indexOf("W"); //first W index num
        int a2 = y1.indexOf("Wednesday"); // second W index num
        System.out.println(a1);
        System.out.println(a2);

        String y2 = "Cybertek School, School";
        int a3 = y2.lastIndexOf("S"); //last S' index number
        System.out.println(a3);







    }
}
