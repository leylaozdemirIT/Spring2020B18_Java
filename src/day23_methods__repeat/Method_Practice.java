package day23_methods__repeat;
/*step1: Hello Cybertek
        step2: Hello World 5 times
        step3: Hello Batch 18
        step4: Hello World 5 times
        step5: Helle Saim
        step6: Hello World 5 times*/
public class Method_Practice {

    public static void main(String[] args) {

        System.out.println("Hello Cybertek");
        printHello5();
        System.out.println("Hello Batch 18");
        printHello5();
        System.out.println("Hello Saim");
        printHello5();

        System.out.println("======================================");

        printEven();

        System.out.println("======================================");

        printOdd();

    }

    public static void printHello5() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }

    public static void printEven() {
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void printOdd() {
        for (int i = 1; i <= 100; i++) {

            if (i % 2 != 0) {

                System.out.print(i + " ");
            }
        }
    }
}
