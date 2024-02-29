package com.mycompany.app.Week2;

public class Method {
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    static void myMethod(String fname) {
        System.out.println(fname + " Doe");
    }

    static int myMethod(int x) {
        return 5 + x;
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied");
        } else {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod("John");
        checkAge(20);
    }
}