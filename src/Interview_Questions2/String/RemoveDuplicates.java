package Interview_Questions2.String;
/*Write a return method that can remove the duplicated values from String

        Ex:  removeDup("AAABBBCCC")  ==> ABC*/
public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println( removeDuplicates("AAABBBCCC") );
    }
    public static String removeDuplicates(String str){
        String nonDup = "";
        for(int i=0; i<str.length(); i++){
            if (!nonDup.contains(""+str.charAt(i))){
                nonDup += str.charAt(i);
            }
        }
        return nonDup;
    }
}
