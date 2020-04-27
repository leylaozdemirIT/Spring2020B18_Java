package day02_Variables;

public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("\tHello");
        System.out.println("\t\t\t\t\t\tHello");
        //\t means a paragraph space

        System.out.println("Cybertek School");
        System.out.println("Cybertek\nSchool");
        System.out.println("\nMy\nName\nIs\nLeyla");
// \n means new line, starts with new line

//print: My favorite TV show is "Game of Thrones" }
        System.out.println("My Favorite TV show is \"Game of Thrones\"");
        // \" means double quote, prints double quote to the console

        System.out.println("\\");
        // \\prints \ on the console

        System.out.println("My favorite book is \'Java\'"); // \' prints '
        System.out.println("My favorite book is 'Java'"); // 'prints '
        // \' or ' they both print single quote'

        System.out.println("/");
    }
}






