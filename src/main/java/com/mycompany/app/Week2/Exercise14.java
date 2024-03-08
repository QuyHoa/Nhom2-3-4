package com.mycompany.app.Week2;
interface Interface1 {
    void method1a();
    void method1b();
}

// Define Interface2
interface Interface2 {
    void method2a();
    void method2b();
}

// Define Interface3
interface Interface3 {
    void method3a();
    void method3b();
}

// Define CombinedInterface by combining Interface1, Interface2, and Interface3
interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void newMethod();
}

// Define a concrete class that MyClass will inherit from
class ConcreteClass {
    // Define any methods or attributes here
}

// Implement CombinedInterface and inherit from ConcreteClass
class MyClass extends ConcreteClass implements CombinedInterface {
    // Implement methods from Interface1
    public void method1a() {
        System.out.println("Implementing method1a()");
    }

    public void method1b() {
        System.out.println("Implementing method1b()");
    }

    // Implement methods from Interface2
    public void method2a() {
        System.out.println("Implementing method2a()");
    }

    public void method2b() {
        System.out.println("Implementing method2b()");
    }

    // Implement methods from Interface3
    public void method3a() {
        System.out.println("Implementing method3a()");
    }

    public void method3b() {
        System.out.println("Implementing method3b()");
    }

    // Implement newMethod from CombinedInterface
    public void newMethod() {
        System.out.println("Implementing newMethod()");
    }
}

class Exercise14 {
    // Method taking Interface1 as an argument
    public static void method1(Interface1 obj) {
        obj.method1a();
        obj.method1b();
    }

    // Method taking Interface2 as an argument
    public static void method2(Interface2 obj) {
        obj.method2a();
        obj.method2b();
    }

    // Method taking Interface3 as an argument
    public static void method3(Interface3 obj) {
        obj.method3a();
        obj.method3b();
    }

    // Method taking CombinedInterface as an argument
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
        // Create an object of MyClass
        M myObject = new M();

        // Pass the object to each of the methods
        method1(myObject);
        method2(myObject);
        method3(myObject);
        method4(myObject);
    }
}
