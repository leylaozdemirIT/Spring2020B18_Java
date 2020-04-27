package day21_MultiDimensionalArrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ForEachLoop {
    /*
    for (DataType variableName : ArrayName ){
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        for (int eachElement : nums) {
            System.out.println(eachElement);
        }
        String[] students = {"Muhtar", "Asiya", "Murodil"};
        for (String eachStudent : students) {
            System.out.println(eachStudent);
        }
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int eachNumber : arr1) {
            if (eachNumber < 5) {
                continue;
            }
            System.out.println(eachNumber);
        }
        System.out.println("=============================");
        String sentence = "I like Java"; // Java like I
        String [] words = sentence.split(" ");
        String reverse = "";

        for (String eachWord : words) { //0 through 2
            System.out.println(eachWord);
        }
        System.out.println("==============================");

        for (int i=words.length-1; i>=0; i-- ){
            // System.out.println(words[i]); --- you can print directly the words OR
            reverse += words[i] + " "; // you can store each word to String result and then print it
        }
        System.out.println(reverse);
    }

}