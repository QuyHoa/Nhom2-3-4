package com.mycompany.app.Week2;

public class MyClass {

    protected int protectedData;

    // Constructor without parameters
    public MyClass() {
        this.protectedData = 0;
    }

    // Constructor with int parameter
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
