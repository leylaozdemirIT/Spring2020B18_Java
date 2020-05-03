package day27_DateTime;

import java.time.LocalDate;

public class Dates {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020, 10,25);

        System.out.println(date1);

        LocalDate birthDate = LocalDate.of(1974,12,31);

        System.out.println(birthDate);

        // isAfter(date2) : returns boolean

        boolean result1 = date1.isAfter(birthDate);
        System.out.println(result1);

        // isBefore(date2) : returns boolean

        boolean result2 = date1.isBefore(birthDate);
        System.out.println(result2);

        // isEqual(date2) : returns boolean
        boolean result3 = date1.isEqual(birthDate);
        System.out.println(result3);

        // isLeapYear : returns boolean
        boolean result4 = birthDate.isLeapYear();
        System.out.println(result4);

        System.out.println("==================================");

        LocalDate now = LocalDate.now();
        System.out.println("Today is: "+now);

        String str = now.toString();
        System.out.println(str.replace("-","/"));

        // month/day/year

        }
}
