package day48_Abstraction;

interface I1{ // 1 abstract method
void method1();
}

abstract class AC implements I2{ // 3 abstract method
abstract void method3();
}
interface I2 extends I1{ // 2 abstract method
void method2();

}

public abstract class extends_implements extends AC{ // 3 abstract method
    @Override
    public void method2(){

    }
    // 2 abstract methods left: method1 & method3
}
class testRun extends extends_implements{
    @Override
    void method3() {

    }

    @Override
    public void method1() {

    }
}
