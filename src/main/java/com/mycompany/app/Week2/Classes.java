package com.mycompany.app.Week2;

import com.mycompany.app.test.java.com.mycompany.app.MyClass;

public class Classes {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.displayMessage();
    }
}
class MyClass {
    public void displayMessage() {
        String message = "Nguyet xinh commit"; 
        System.out.println(message);
    }
}
