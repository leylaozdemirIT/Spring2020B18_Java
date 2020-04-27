package Resources;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {

    }

    public static String Reverse2(String str) {
        String Reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            Reverse += str.charAt(i);
        }
        return Reverse;
    }

    public static int[] sortDescending(int[] arr) {
        Arrays.sort(arr);

        int[] RevArr = new int[arr.length];

        int j = arr.length - 1;
        for (int i = 0; i <= arr.length - 1; i++) {
            RevArr[i] = arr[j];
            j--;
        }
        return RevArr;
    }


    public static String RemoveDuplicates(String str) {
        String result = ""; // AB - if we remove duplicates

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //A
            if (!result.contains("" + ch)) {
                result += ch;
            }
        }
        return result;
    }

    public static int Frequency (String str1, String str2){
        int count = 0;
        while (str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2,"");
            // we need to make sure that we are not counting the same index over again
        }

        return count;

    }
    public static String FrequencyOfChars (String str){
        String NonDup = Library.RemoveDuplicates(str); // ABC
        String result = ""; // contains the frequency of chars

        for (int i=0; i<=NonDup.length()-1; i++){
            String ch = ""+NonDup.charAt(i);
            int num = Library.Frequency(str,ch);
            // System.out.println(ch+num);
            result += ch+num;
        }
        return result;
    }
    public static int Frequency(String str, char ch){ // counts the ch' frequency
        char[] arr =  str.toCharArray(); // [A, B, B]

        int count = 0; //1
        for(char each  : arr ){ //3   each: A , B, B
            if(each == ch){
                count++;
            }
        }

        return count;
    }

}

