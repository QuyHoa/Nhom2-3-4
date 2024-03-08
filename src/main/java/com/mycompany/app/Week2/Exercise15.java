package com.mycompany.app.Week2;

// Step 1: Create an abstract class with two abstract methods
abstract class AbstractClass {
    abstract void abstractMethod1();
    abstract void abstractMethod2();
}

// Step 2: Inherit the abstract class into the derived class along with implementing the interface
class MyClass extends AbstractClass implements CombinedInterface, Interface1 {
    // Step 3: Implement the abstract methods from the abstract class
    void abstractMethod1() {
        System.out.println("Implementing abstractMethod1()");
    }

    void abstractMethod2() {
        System.out.println("Implementing abstractMethod2()");
    }

    // Implement the interface methods from Interface1
    public void method1a() {
        System.out.println("Implementing method1a()");
    }

    public void method1b() {
        System.out.println("Implementing method1b()");
    }

    // Implement the interface methods from CombinedInterface (already implemented in previous code)
    // Implement the interface methods from Interface2 (already implemented in previous code)
    // Implement the interface methods from Interface3 (already implemented in previous code)

    public void newMethod() {
        System.out.println("Implementing newMethod()");
    }
}

public class Exercise15 {
    public static void method1(Interface1 obj) {
        obj.method1a();
        obj.method1b();
    }

    public static void method2(Interface2 obj) {
        obj.method2a();
        obj.method2b();
    }

    public static void method3(Interface3 obj) {
        obj.method3a();
        obj.method3b();
    }

    public static void method4(CombinedInterface obj) {
        obj.method1a();
        obj.method1b();
        obj.method2a();
        obj.method2b();
        obj.method3a();
        obj.method3b();
        obj.newMethod();
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        method1(myObject);
        method2(myObject);
        method3(myObject);
        method4(myObject);
    }
}
