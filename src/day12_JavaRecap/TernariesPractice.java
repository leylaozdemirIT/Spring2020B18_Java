package day12_JavaRecap;
/*200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable*/

import java.util.Scanner;

public class TernariesPractice {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        System.out.println("Enter status code: ");
        int statusCode = scan.nextInt();

        String result = "";

        if (statusCode == 200){
            result = "OK";
        } else if (statusCode == 201){
            result = "Created";
        }else if (statusCode == 202){
            result = "Accepted";
        }else {
            result = "Invalid status code";
        }
        System.out.println(result);

        String result2 = (statusCode == 200) ? "OK" : (statusCode == 201) ? "Created" :
                (statusCode == 202) ? "Accepted" : "Invalid status code";

        System.out.println(result2);


    }
}
