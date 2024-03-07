package com.mycompany.app.Week2;

public class Ex21 {
    
    public final void finalMethod() {
        System.out.println("Final method.");
    }
}

class ExClass extends Ex21 {
    
}

class Main {
    public static void main(String[] args) {
        Ex21 parent = new Ex21();
        parent.finalMethod(); 
    }
}

