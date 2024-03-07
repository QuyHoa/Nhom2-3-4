package com.mycompany.app.Week2;

class Base {
    void method1() {
        System.out.println("Base: Inside method1()");
        method2();
    }

    void method2() {
        System.out.println("Base: Inside method2()");
    }
}

class Derived extends Base {
    @Override
    void method2() {
        System.out.println("Derived: Inside overridden method2()");
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        Base baseObj = new Derived(); // Upcasting
        baseObj.method1();
    }
}
