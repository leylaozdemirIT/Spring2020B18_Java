package Resources;

public class Quiz {

    public Quiz(){
        System.out.println("A");
    }
    public Quiz(int a){
        this(2.5);
        System.out.println("B");
    }
    public Quiz(double a){
        this();
        System.out.println("C");
    }

    public static void main(String[] args) {
        Quiz obj = new Quiz(100);
    }
}
