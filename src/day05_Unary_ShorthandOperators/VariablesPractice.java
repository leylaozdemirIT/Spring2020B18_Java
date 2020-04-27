package day05_Unary_ShorthandOperators;

public class VariablesPractice {

    public static void main(String[] args) {
        // whole numbers: byte, short, int, long
        // decimals: float, double

        int a1 = 100;
        float f1= (long) a1;
        // f1 = 100L;
        // f1 = 100.0

        System.out.println(f1);

        long l1 = (long)f1;

        System.out.println(l1);

        System.out.println("===============================================================");

        String name;
        name = "Cybertek";
        System.out.println(name); // local variables cannot be used without initializing

        name = "Cybertek"; // in java: first come first served
        System.out.println(name);

    /*Create a double variable with the value 20
            2. Create a second variable of type double with the value 80
            3. Add both numbers up and multiply by 25
            4. Use the remainder operator to figure out the remainder from the sum of #3 divided
    by 40
            5. Print remaining total (#4) is equal to 20 or less : true/false*/



    }}
