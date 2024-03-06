package com.mycompany.app.Week2.ex5;
class MyClass {
    public int publicField;
    private int privateField;
    protected int protectedField;
    int packageAccessField;

    public MyClass() {
        publicField = 1;
        privateField = 2;
        protectedField = 3;
        packageAccessField = 4;
    }

    public void publicMethod() {
        System.out.println("This is a public method");
    }

    private void privateMethod() {
        System.out.println("This is a private method");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    void packageAccessMethod() {
        System.out.println("This is a package-access method");
    }
}

public class ex5 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Accessing public members
        System.out.println("Public field: " + obj.publicField);
        obj.publicMethod();

        // Attempting to access private members (will result in compiler error)
        // System.out.println("Private field: " + obj.privateField);
        // obj.privateMethod();

        // Accessing protected members (since the class is in the same package)
        System.out.println("Protected field: " + obj.protectedField);
        obj.protectedMethod();

        // Accessing package-access members (since the class is in the same package)
        System.out.println("Package-access field: " + obj.packageAccessField);
        obj.packageAccessMethod();
    }
}