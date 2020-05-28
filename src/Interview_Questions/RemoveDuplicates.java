package Interview_Questions;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAAABBBBBCCCC"));
    }

    public static String removeDuplicates(String a){
        //AABBBBBCCC

        String result = "";
        for (int i=0; i<a.length(); i++){
            if( !result.contains("" + a.charAt(i)) ){
                result += a.charAt(i);
            }
        }
        return result;
    }
}
