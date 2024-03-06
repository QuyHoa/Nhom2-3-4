package com.mycompany.app.Week2;

public class Amphibian {
    
        void swim() {
            System.out.println("Amphibian swimming");
        }
    
        void jump() {
            System.out.println("Amphibian jumping");
        }
    }
    
    class Frog extends Amphibian {
        void croak() {
            System.out.println("Frog croaking");
        }
    }
    
     class Main {
        public static void main(String[] args) {
            Frog frog = new Frog();
            
            Amphibian amphibian = frog;
    
            
            amphibian.swim(); 
            amphibian.jump(); 
        }
    }
    

