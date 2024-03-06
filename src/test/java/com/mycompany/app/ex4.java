package com.mycompany.app.test.java.com.mycompany.app;

public class MyClass {
    protected void myProtectedMethod() {
        System.out.println("This is a protected method");
    }
}
public class ex4 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myProtectedMethod(); // Đây là cách truy cập phương thức protected
    }
}
