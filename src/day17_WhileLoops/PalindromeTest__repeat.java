package day17_WhileLoops;

public class PalindromeTest__repeat {

    public static void main(String[] args) {
        String str = "level";

        String reversedStr = ""; // store the reversed version of str

        int index = str.length()-1; // last index number

        while (index>=0){
            reversedStr += str.charAt(index);
            index--;
        }
        boolean palindrome = reversedStr.equals(str);

        System.out.println(palindrome);
    }
}
