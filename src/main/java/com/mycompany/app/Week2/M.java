package com.mycompany.app.Week2;
import com.mycompany.app.Week2.CombinedInterface;

public class M implements CombinedInterface{
  
        public void method1a() {
            System.out.println("Implementing method1a()");
        }
    
        public void method1b() {
            System.out.println("Implementing method1b()");
        }
    
        // Implement methods from Interface2
        public void method2a() {
            System.out.println("Implementing method2a()");
        }
    
        public void method2b() {
            System.out.println("Implementing method2b()");
        }
    
        // Implement methods from Interface3
        public void method3a() {
            System.out.println("Implementing method3a()");
        }
    
        public void method3b() {
            System.out.println("Implementing method3b()");
        }
    
        // Implement newMethod from CombinedInterface
        public void newMethod() {
            System.out.println("Implementing newMethod()");
        }
    }
    

