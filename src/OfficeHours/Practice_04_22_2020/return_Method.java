package OfficeHours.Practice_04_22_2020;

public class return_Method {
    public static void main(String[] args) {
        // int a = Add2numbers(10, 20);

        int num1 = sum(10,20);

        System.out.println(num1);

        System.out.println("==========================");
        String str = "Cybertek";

        String str1 = ReverseString(str);
        System.out.println(str1);




        }



    public static void Add2numbers(int a, int b) {
        System.out.println(a + b);

    }
    public static int sum (int a,int b){

        return a+b;
    }
    public static String ReverseString (String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }}
