package Interview_Questions2.String;
/*Write a return  method that can find the unique characters from the String

        Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/
public class FindTheUnique {
    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));
    }

    public static String unique(String str) {
        String[] arr = str.split("");

        String uniques = "";

        for (int i = 0; i < arr.length; i++) {
            int num = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals(arr[i])) {
                    num++;
                }
            }
            if (num == 1) {
                uniques += arr[i];
            }

        }
        return uniques;
    }
}












