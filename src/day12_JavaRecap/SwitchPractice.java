package day12_JavaRecap;

public class SwitchPractice {
    public static void main(String[] args) {

        switch (3){
            case 1:
                System.out.println("Case 1");
                break; //exits the switch statement immidiately

            case 2:
                System.out.println("Case 2");
                break;

            default:
                System.out.println("Invalid case");
        }

        System.out.println("================================================");

        int statusCode = 400;
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

        switch (statusCode){

            case 200:
                System.out.println("OK");
                break;
            case 201:
                System.out.println("Created");
                break;
            case 202:
                System.out.println("Accepted");
                break;
            case 301:
                System.out.println("Moved Permenantly");
                break;
            case 303:
                System.out.println("See other");
                break;
            case 304:
                System.out.println("Not modified");
                break;
            case 307:
                System.out.println("Temporary Redirect");
                break;
            case 400:
                System.out.println("Bad Request");
                break;
            case 401:
                System.out.println("Unauthorized");
                break;





            default:
                System.out.println("Invalid status code");










        }






    }

}
