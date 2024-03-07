

 package com.mycompany.app;

class Ex23 {
   
    public static String staticVariable = "Hello, World!";
    

    static {
        System.out.println("Ex23 đang tải...");
    }
    
   
    public Ex23() {
        System.out.println("Ex23 đã xong !");
    }
    
    public static void main(String[] args) {
       
        Ex23 obj1 = new Ex23();
        
        System.out.println("Value of obj1: " + obj1);
       
        System.out.println(Ex23.staticVariable);
        
        
        Ex23 obj2 = new Ex23();
        
       
        System.out.println("Value of obj2: " + obj2);
    }
} 
    

