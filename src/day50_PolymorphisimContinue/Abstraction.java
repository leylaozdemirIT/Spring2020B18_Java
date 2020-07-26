package day50_PolymorphisimContinue;


interface I{
    void method2(); // public abstract
    abstract int method3();

    // public I(){ }


    // public void m(){ }

    //}
    //{ }
    // static { }
    int a = 1000;

    public static void main(String[] args) {
        System.out.println(a);
        // a = 2000; // because by default it is final. can not be reassigned
    }

}





abstract class A{
    {

    }

    static{

    }
    public A(){

    }
    protected abstract void method1();
    public void method4(){ }
}
interface I2{

}


public abstract class Abstraction extends A implements I, I2 {

    public Abstraction() {
        super();
    }

    @Override
    protected void method1(){

    }

    @Override
    public void method4() {
        super.method4();
    }

    @Override
    public void method2() {

    }

    @Override
    public int method3() {
        return 0;
    }

    // public abstract void method();
}
