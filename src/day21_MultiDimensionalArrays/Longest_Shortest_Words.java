package day21_MultiDimensionalArrays;
/* write a program that can return the longest string of text from array
write a program that can return the shortest string of text from an array
 */
public class Longest_Shortest_Words {
    public static void main(String[] args) {
        String[] names = {"Reem", "Omer", "Muhtar", "Emrah", "Mohammed", "Ana", "AAAAAABBBBBBBBBB"};

        int maxLengthString = names[0].length(); //4,
        int minLengthString = names[0].length();
        String longestWord = names[0];
        String shortestWord = names[0];


        for (int i = 0; i <= names.length - 1; i++) {

            if (names[i].length() > maxLengthString) {
                maxLengthString = names[i].length();
                longestWord = names[i];
            }
            if (names[i].length() < minLengthString) {
                minLengthString = names[i].length();
                shortestWord = names[i];
            }
            System.out.println(longestWord);
            System.out.println(shortestWord);
        }
    }
}