package com.mycompany.app.Week2;

public class ConstantDemo {
   
    static final int STATIC_FINAL_VALUE = 100;

    
    final int FINAL_VALUE;

    public ConstantDemo(int finalValue) {
        this.FINAL_VALUE = finalValue;
    }

    public static void main(String[] args) {
        
        System.out.println("Static final field value: " + ConstantDemo.STATIC_FINAL_VALUE);

       
        ConstantDemo obj1 = new ConstantDemo(200);
        ConstantDemo obj2 = new ConstantDemo(300);

        
        System.out.println("Final field value for obj1: " + obj1.FINAL_VALUE);
        System.out.println("Final field value for obj2: " + obj2.FINAL_VALUE);

    }
}
