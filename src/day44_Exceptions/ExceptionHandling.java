package day44_Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        String str = "Cybertek";

        try{

            System.out.println(str.charAt(100));

        }catch (RuntimeException e){
            String description = e.getMessage();
            System.out.println(description);
        }

        System.out.println("=================================");

        String result = "";

        try{
            System.out.println(100/0); // unchecked exception
            System.out.println("Try block");

        }catch(RuntimeException e){
            System.out.println("Catch block");
            result = e.getMessage();
        }

        System.out.println("Completed");
    }
}
/*
testCase:
    step1
    step2
    step3
    step4
    ....
    step10
 */
