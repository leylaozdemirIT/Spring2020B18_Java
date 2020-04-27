package day23_methods;
// create a function that can reverse any string
public class Methods_WithParameters2 {
    public static void main(String[] args) {
        String names = "Leyla";
        ReverseString(names);
        System.out.println();
        String names2 = "Cybertek School";
        ReverseString(names2);

    }


    public static void ReverseString(String str) {

        for (int i=str.length()-1; i>=0; i-- ){
            System.out.print (str.charAt(i));
        }
    }
}