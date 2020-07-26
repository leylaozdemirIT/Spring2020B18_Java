package Interview_Questions.String__CONTINUE;

public class StringReverse {

    public static void main(String[] args) {
        System.out.println(StrReverse("Derin Ozdemir"));
        System.out.println(Palindrome("level"));
    }

    public static String StrReverse(String str){
        String reversed = "";
        for (int i=str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }
    public static boolean Palindrome(String str){
        String reverse = StrReverse("level");
        if (reverse.equalsIgnoreCase(StrReverse("level"))){
            return true;
        }else{
            return false;
        }
    }
}
