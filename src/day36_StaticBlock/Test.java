package day36_StaticBlock;

public class Test {
    public static void main(String[] args) {
        System.out.println(StaticBlock2.tester1);
        // we could use it because it was initialized in static block in StaticBlock2

        System.out.println(StaticBlock3.name);
        System.out.println(StaticBlock3.num);

        System.out.println(StaticBlock3.tester1);
    }
}
