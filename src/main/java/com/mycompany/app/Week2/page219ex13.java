package com.mycompany.app.Week2;

// Define the base interface
interface BaseInterface {
    void baseMethod();
}

// Inherit two new interfaces from the base interface
interface DerivedInterface1 extends BaseInterface {
    void derivedMethod1();
}

interface DerivedInterface2 extends BaseInterface {
    void derivedMethod2();
}

// Multiply inherit a third interface from the second two interfaces
interface MultiDerivedInterface extends DerivedInterface1, DerivedInterface2 {
    void multiDerivedMethod();
}

// Implementing class
class MyClass implements MultiDerivedInterface {
    public void baseMethod() {
        System.out.println("Base method implementation");
    }

    public void derivedMethod1() {
        System.out.println("Derived method 1 implementation");
    }

    public void derivedMethod2() {
        System.out.println("Derived method 2 implementation");
    }

    public void multiDerivedMethod() {
        System.out.println("Multi-derived method implementation");
    }
}

class Page219ex13 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.baseMethod();
        obj.derivedMethod1();
        obj.derivedMethod2();
        obj.multiDerivedMethod();
    }
}
