package Interview_Questions;

public class FindTheUnique {
    public static void main(String[] args) {
        System.out.println(FindTheUnique("AAAACDDDR"));
    }

    public static String FindTheUnique(String str) {
        String[] arr = str.split(""); // we can put all the elements in an array
        String uniques = "";

        for (int j = 0; j < arr.length; j++) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
            if (count == 1) {
                uniques += arr[j];
            }
        }


        return uniques;
    }
}