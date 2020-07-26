package Interview_Questions2.String;
/*Write a return method that can reverse  String

        Ex: Reverse("ABCD"); ==> DCBA*/
public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse("Leyla"));
    }
    public static String reverse(String str){
        String reverse = "";

        for (int i=str.length()-1; i>=0; i--){
            reverse += ""+str.charAt(i);
        }
        return reverse;
    }
}
