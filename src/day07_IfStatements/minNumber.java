package day07_IfStatements;
/*2. write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)*/
public class minNumber {
    public static void main(String[] args) {

        double a = 100;
        double b = 200;
        double c = 300;

        boolean aMin = a < b && a < c ; //if a is less than both b and c, then a is the minimum
        boolean bMin = b < c && b < a; // if b is less than both a and c, then b is the minimum
        boolean cMin = c < a && c < b; // if c is less than both b and a, then c is the minimum

        if (aMin){
            System.out.println(a + " is the minimum number");
        }

        if (bMin){
            System.out.println(b + " is the minimum number");
        }

        if (cMin){
            System.out.println(c + " is the minimum number");
        }


    }
}
