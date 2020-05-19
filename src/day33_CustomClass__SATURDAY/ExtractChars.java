package day33_CustomClass__SATURDAY;

import java.util.ArrayList;

/*write a program that can extract the special characters, digits and alphabets from a string and stores them into seperate ArrayLists of Character:
        ex:
        str = "ABCD123$%#@&456EFG!";
        list1: {$, %, #, @, &, !}
        list2: {A, B, C, D, E, F, G}
        list3: {1, 2, 3, 4, 5, 6}*/
public class ExtractChars {
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";
        char[] arr = str.toCharArray();

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();

        for (char each : arr) {
            if (Character.isLetter(each)) {
                letters.add(each);
            } else if (Character.isDigit(each)) {
                digits.add(each);
            } else {
                specialChars.add(each);
            }
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);

        // try the below on your own

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] <= 57 || arr[i] >= 48) {
                digits.add(arr[i]);
            } else if ((arr[i] >= 65 && arr[i] <= 90) && (arr[i] >= 97 && arr[i] <= 122)){ // WORK ON THIS STATEMENT
                letters.add(arr[i]);
            } else {
                specialChars.add(arr[i]);
            }

        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);
    }}

