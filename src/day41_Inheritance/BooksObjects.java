package day41_Inheritance;

public class BooksObjects {

    public static void main(String[] args) {

        EBook book1 = new EBook();
        book1.title = "Hamlet";
        book1.author = "Shakespeare";
        book1.price = 20;

        book1.size = "1.5MB";
        book1.pages = 432;

        System.out.println(book1);
        System.out.println( "Size: " + book1.size );
        System.out.println("pages: "+ book1.pages);

        book1.readbook();

        System.out.println("=======================================");

        AudioBook book2 = new AudioBook();

        book2.length = "19 hours and 3 minutes";
        book2.title = "Becoming";
        book2.author = "Michelle Obama";
        book2.price = 30;

        System.out.println(book2);
        System.out.println("Length of the audiobook: \""+book2.title+"\" is "+book2.length);

        book2.listen();


    }
}
