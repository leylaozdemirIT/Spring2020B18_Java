package day09_NestedIf_Ternary;

public class Ternary {
    public static void main(String[] args) {


        System.out.println("============================================");
        int num1 = 100;
        int num2 = 200;
        int max = 0;

        if (num1 > num2){
            max = num1;
        } else {
            max = num2;
        }

        int max2 = (num1 > num2) ? num1 : num2;
        System.out.println(max);
        System.out.println(max2);

        System.out.println("====================================================");

        String str = "";
        if (true){
            str = "Hello";
        }else {
            str = "Hola";
        }
        System.out.println(str);

        String str2 = (true) ? "Hello" : "Hola";

        System.out.println(str2);



    }










}
