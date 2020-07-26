package Interview_Questions2.String;
//Write a method that can return the sum of the digits in a string
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println( sum("A1B3"));
    }

public static int sum(String str){
    int sum = 0;
    char [] arr = str.toCharArray();
    for (int i=0; i<arr.length; i++){
        if(Character.isDigit(arr[i])){
            sum += Integer.valueOf("" + arr[i]);
        }
    }
    return sum;
}
}
