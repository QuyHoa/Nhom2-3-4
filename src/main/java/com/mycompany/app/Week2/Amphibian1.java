package com.mycompany.app.Week1;

public class Amphibian1 {
    
        void swim() {
            System.out.println("Amphibian1 bơi");
        }
    
        void jump() {
            System.out.println("Amphibian1 nhảy");
        }
    }
    
    class Frog extends Amphibian {
        
       
        void swim() {
            System.out.println("Frog bơi");
        }
    
       
    
        void jump() {
            System.out.println("Frog nhảy");
        }
    
        void croak() {
            System.out.println("Frog kêu");
        }
    }
    
   class Main {
        public static void main(String[] args) {
            Frog frog = new Frog();
            
            Amphibian amphibian = frog;
    
            amphibian.swim();
    
           
        }
    }
    

