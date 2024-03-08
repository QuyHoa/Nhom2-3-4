package com.mycompany.app.Week2;
/// Main.java


class Main {
    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass obj = new MyClass();

        // Access the method from MyClass
        obj.myMethod(); // This should work as myMethod is public in the interface
    }
}

interface MyInterface {
    void myMethod();
}

class MyClass implements MyInterface {
    public void myMethod() {
        System.out.println("Implementing myMethod in MyClass");
    }
}
