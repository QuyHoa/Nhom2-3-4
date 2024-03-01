package com.mycompany.app.Week2;

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
