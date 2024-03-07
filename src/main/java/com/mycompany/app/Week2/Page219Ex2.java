package com.mycompany.app.Week2;

abstract class AbstractClassWithoutAbstractMethod {
    void regularMethod() {
        System.out.println("This is a regular method.");
    }
}

class Main {
    public static void main(String[] args) {
        // Attempt to create an instance of AbstractClassWithoutAbstractMethod
        // This will result in a compilation error because the class is abstract
        // AbstractClassWithoutAbstractMethod obj = new AbstractClassWithoutAbstractMethod();
    }
}
