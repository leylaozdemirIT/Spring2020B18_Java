package day27_DateTime;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {

        //days_month_year

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));

        /*
        create a date called birthday: MMM/Days/year
        ex: 2020 04 23
        Apr / 23 / 20
         */
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEE MMM/dd/yy");

        LocalDate birthdate = LocalDate.of(1974,12,31);

        String str1 = birthdate.format(dtf2);

        System.out.println(str1);

        LocalDate date3 = LocalDate.now();

        System.out.println( date3.format(dtf2) );

    }



}
