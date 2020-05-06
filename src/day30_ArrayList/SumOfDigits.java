package day30_ArrayList;
 /*
 write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits
  */

import java.util.Arrays;

public class SumOfDigits {

    public static void main(String[] args) {
        String str = "a1b2c38";

        char [] arr = str.toCharArray();

        System.out.println(Arrays.toString(arr));

        int sum = 0;


        for (char each : arr){
            /*
            boolean isDigit = each>=48 && each <= 57;
            if (isDigit ){
               sum +=  Integer.parseInt(""+ each); // "0"
             */

        if (Character.isDigit(each)){ //isDigit(): identifies if the character is digit
          sum += Integer.parseInt(""+each);
            }

        }
        System.out.println(sum);

        boolean a = Character.isAlphabetic('A'); // identifies if the character is alphabet

    }
}
