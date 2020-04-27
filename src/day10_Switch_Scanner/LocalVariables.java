package day10_Switch_Scanner;

public class LocalVariables {
    public static void main(String[] args) {
        // declare a variable: dataType variableName;

        int a = 0;

        if (true){
            System.out.println(a);
            int b = 10;
        }
        // System.out.println (b) - local variables cannot be used outside its block

        switch (3){
            case 1:
                int c = 100;
            case 2:
              //  System.out.println(c); must be within the case block 1

        if (9 > 10){
            int t = 100;
        }else if (11>10){
            int t = 200;
        }else if (12>10){
            int t = 300;
            System.out.println(t);
        }







        }







    }
}
