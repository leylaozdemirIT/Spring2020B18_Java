package day42_Inheritance;

class A{
    int a = 300;

    public A(double b){
        System.out.println(this.a); // 300
    }
}

public class SuperKeyword extends A{
    int a = 200;

    public SuperKeyword(){
        super(10.0); // 300
        System.out.println(this.a); // 200
        System.out.println(super.a); // 300
    }

    public static void main(String[] args) {
        SuperKeyword obj = new SuperKeyword();

        A obj2 = new A(10.0);
    }
}
