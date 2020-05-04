package day29_Wrapper_ArrayList___;

public class ParseMethods {

    public static void main(String[] args) {
        String str = "123";

        int a1 = Integer.parseInt(str); //123

        System.out.println(str+1);
        // text, when we put 1 next to a string, it does concatination
        // "123" + 1 = "1231"
        System.out.println(a1+1);  // number
        // 123 + 1 = 124

        byte b1 = Byte.parseByte(str);
        System.out.println(b1 + 5);

        Integer I1 = (int)Byte.parseByte(str); // AutoBoxing
        // Integer = (int) byte;
        // Integer = int;

        String str2 = "12.5";

        float f1 = Float.parseFloat(str2); // float 10.5

        System.out.println(f1 + 1); // 13.5

        double d1 = Double.parseDouble(str2); // double 10.5

        System.out.println(f1 + 1); // 13.5

        String str3 = "3147483647";

        Long L1 = Long.parseLong(str3); // long 3147483647

        System.out.println(L1 + 2);

        Long num2 = Long.parseLong(str3); // autoboxing

        System.out.println(num2 + 2);

        String result = "TrUe"; // if the synthax is not "true" or "false" ==> "false"

        Boolean B1 = Boolean.parseBoolean(result); // boolean

        System.out.println(B1);

        String result2 = "fALsE"; // "false"

        boolean r2 = Boolean.parseBoolean(result2);

        System.out.println(r2);

    }
}
