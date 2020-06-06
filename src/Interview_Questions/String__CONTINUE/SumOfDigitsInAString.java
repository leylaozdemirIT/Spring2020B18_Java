package Interview_Questions.String__CONTINUE;

public class SumOfDigitsInAString {
    public static void main(String[] args) {
        System.out.println(SumOfDigitsInAString("AAAA12YYYYY"));
    }

    public static int SumOfDigitsInAString(String str){
        char [] ch = str.toCharArray();

        int sum=0;
        for (char each: ch){
            if (Character.isDigit(each)){
                sum += Integer.parseInt("" +each);
            }
        }
        return sum;
    }
}
