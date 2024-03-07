package com.mycompany.app.Week3;

abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: éc éc");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: gâu gâu");
    }
}

public class AbstractionW3S {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
        Dog myDog = new Dog();
        myDog.animalSound();
        myDog.sleep();
    }
}
