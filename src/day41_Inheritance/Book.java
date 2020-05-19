package day41_Inheritance;

public class Book {

    /*
    title
    author
    price

    toString()
     */

    public String title;
    public String author;
    public double price;

    public String toString(){
        return "Title: " + title + " Author: "+ author + ", $" + price;
    }


}
