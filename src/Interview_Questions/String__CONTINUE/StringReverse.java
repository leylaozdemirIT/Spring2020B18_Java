package Interview_Questions.String__CONTINUE;

public class StringReverse {

    public static void main(String[] args) {
        System.out.println(StrReverse("Derin Ozdemir"));
    }

    public static String StrReverse(String str){
        String reverse ="";

        for (int i=str.length()-1; i>=0; i--){
            reverse += str.charAt(i);

        }
        return reverse;
    }
}
