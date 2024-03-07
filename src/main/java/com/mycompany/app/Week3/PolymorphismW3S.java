package com.mycompany.app.Week3;

public class PolymorphismW3S {
    static class Animal {
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
    }

    static class Pig extends Animal {
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    static class Dog extends Animal {
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }

    static class Goat extends Animal {
        public void animalSound() {
            System.out.println("The goat says: bee bee");
        }
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();
        Animal myGoat = new Goat();
        
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        myGoat.animalSound();
    }
}
