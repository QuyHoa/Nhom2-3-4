package com.mycompany.app.Week2;

public class AnotherClass {
    public void modifyProtectedData(M obj) {
        obj.setProtectedData(20); // Accessing protected data through a public method
        System.out.println("Modified protected data: " + obj.getProtectedData());
    }
}

