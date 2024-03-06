package com.mycompany.app.Week2.test.java.com.mycompany.app;
class MyClass {
    protected int protectedData;

    // Constructor without parameters
    public MyClass() {
        this.protectedData = 0;
    }

    public MyClass(int data) {
        this.protectedData = data;
    }

    public int getProtectedData() {
        return protectedData;
    }

    public void setProtectedData(int newData) {
        this.protectedData = newData;
    }
}

public class Ex6 {
    public static void main(String[] args) {
        MyClass obj = new MyClass(10);
        AnotherClass anotherObj = new AnotherClass();

        // Accessing protected data through a method in another class
        anotherObj.modifyProtectedData(obj);
    }
}
class AnotherClass {
    public void modifyProtectedData(MyClass obj) {
        obj.setProtectedData(20); // Accessing protected data through a public method
        System.out.println("Modified protected data: " + obj.getProtectedData());
    }
}
