package Interview_Questions.String__CONTINUE;

public class FindTheUnique {
    public static void main(String[] args) {
        System.out.println(FindTheUnique("ADDCCE"));
    }

    public static String FindTheUnique(String str) {
        String[] arr = str.split(""); // A D D C C E
        String uniques = "";
        for (int i = 0; i < arr.length; i++) { // A
            int count = 0;
            for (int j = 0; j < arr.length; j++) { // A D D C C E
                if (arr[j].equals(arr[i])){
                    count++;
                }
            }
            if (count == 1) {
                uniques += arr[i];
            }
        }
        return uniques;
    }
}