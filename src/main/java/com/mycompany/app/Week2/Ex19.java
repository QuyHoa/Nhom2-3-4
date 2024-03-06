package com.mycompany.app.Week2;
public class Ex19 {
    private final Object myObject;

    public Ex19() {
        myObject = new Object();
    }

    public Ex19(Object obj) {
        myObject = obj;
    }

    public void doSomething() {
        System.out.println("Using myObject: " + myObject.toString());
    }

    public static void main(String[] args) {
        Ex19 obj1 = new Ex19();
        obj1.doSomething();

        Object newObj = new Object();
        Ex19 obj2 = new Ex19(newObj);
        obj2.doSomething();
    }
}