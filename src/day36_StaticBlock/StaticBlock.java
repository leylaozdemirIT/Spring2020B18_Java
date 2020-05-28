package day36_StaticBlock;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main method executed");
        methodLife();
    }
    static{
            System.out.println("Static Block executed 1st");
    }
    public static void methodLife(){
            System.out.println("Custom method executed");
    }

}


