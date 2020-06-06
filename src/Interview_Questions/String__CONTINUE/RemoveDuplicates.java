package Interview_Questions.String__CONTINUE;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAAABBBBBCDDDDE"));
    }

    public static String removeDuplicates(String a){
        //AABBBBBCCC

        String nonDup = ""; // A
        for (int i=0; i<a.length(); i++){
            if( !nonDup.contains(""+ a.charAt(i)) ){
                nonDup += "" + a.charAt(i);
            }
        }
        return nonDup;
    }
}
