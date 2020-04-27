package day19_Arrays;
  /*write a program that can return the frequency of the characters in a string
           Ex: "AABCBCA" ==> "A3B2C2"
           Hint: You need nested loops*/
public class Frequency__STUDY {

      public static void main(String[] args) {
          String str = "AABBCCDEEEEFFFFG";
          String result = "";

          String nonDupl = ""; //ABC


          for (int i=0; i<=str.length()-1; i++){ //if the character at index i is not contained in NonDupl, then it will be concated
              if ( ! nonDupl.contains(""+str.charAt(i)) ){
                    nonDupl += str.charAt(i);
              }
          }
          System.out.println(nonDupl);

       for (int i=0; i<=nonDupl.length()-1;i++ ){
           int count = 0; // count the total number of occurence of each character in str
           for (int j=0; j<= str.length()-1; j++){
               if (str.charAt(j) == nonDupl.charAt(i) ){
                   count++;
               }
           }
           result += "" + nonDupl.charAt(i) +count;
       }
          System.out.println(result);





      }











}
