package com.mycompany.app.Week2;

import com.mycompany.app.Week2.DerivedClass;

class Reusingex3 {
    public Reusingex3() {
        System.out.println("Reusingex3 constructor");
    }
}

class DerivedClass extends Reusingex3 {
    
}

class Cartoon extends DerivedClass {
   
}

 class Main {
    public static void main(String[] args) {
        new Cartoon(); 
    }
}