package day47_Abstraction;

abstract class A {
    public abstract void method1();
    public void method2() { }

}


public class Abstract_VS_NonAbstract2 extends A{ // MANDATORY to override the abstract method of A
    // 2 methods - both are instance methods.Abstract methods can not exist in normal class8
    public void method1(){

    }

}


abstract class B extends A{  // optional to override the abstract method of A
// one abstract & one instance methods

    public abstract void method1();

}

class C extends B{

    public void method1(){

    }

}



