package OfficeHours.Practice_05_27_2020;

import java.lang.reflect.Method;

public class MethodOverriding {

    public void method1() {
        System.out.println("Super class");
    }
}
    class Test extends MethodOverriding{

        @Override
        public void method1(){
            System.out.println("Sub class");
        }

        public static void main(String[] args) {
           MethodOverriding obj = new MethodOverriding();
           obj.method1(); // Super class

           Test obj1 = new Test();
           obj1.method1(); // sub class
        }
    }

