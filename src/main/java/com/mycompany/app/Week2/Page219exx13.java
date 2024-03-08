package com.mycompany.app.Week2;

// Define the base abstract class
abstract class BaseClass {
    abstract void baseMethod();
}

// Inherit two new abstract classes from the base class
abstract class DerivedClass1 extends BaseClass {
    abstract void derivedMethod1();
}

abstract class DerivedClass2 extends BaseClass {
    abstract void derivedMethod2();
}

// Multiply inherit a third abstract class from the second two abstract classes
abstract class MultiDerivedClass extends DerivedClass1 {
    abstract void multiDerivedMethod();
}

// Implementing class
class MyClass extends MultiDerivedClass {
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

class Page219exx13 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.baseMethod();
        obj.derivedMethod1();
        obj.derivedMethod2();
        obj.multiDerivedMethod();
    }
}
