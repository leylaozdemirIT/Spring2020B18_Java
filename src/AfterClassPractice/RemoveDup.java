package AfterClassPractice;

public class RemoveDup {
    public static void main(String[] args) {
//this method remove duplicates and stores them in another string
        String str = "ABCABC";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            String temp = str.charAt(i) + "";
            if (!unique.contains(temp)) {
                unique += temp;
            }
        }
        System.out.println(unique);

        System.out.println("=========================");
    }


}