package com.mycompany.app.Week2;

public class Reusingex1 {
    public static void main(String[] args) {
        SecondClass secondObj = new SecondClass();
        secondObj.initializeFirstClass();
        secondObj.useFirstClass();
    }
}

class FirstClass {
    private String s; 
    public FirstClass() {
        System.out.println("FirstClass()");
        s = "Constructed";
    }
    public String toString() {
        return s;
    }
}

class SecondClass {
    private FirstClass firstObj; 
    public void initializeFirstClass() {
        if (firstObj == null) {
            firstObj = new FirstClass();
        }
    }
    public void useFirstClass() {
        if (firstObj != null) {
            System.out.println(firstObj.toString());
        } else {
            System.out.println("FirstClass chưa khởi tạo.");
        }
    }
}
