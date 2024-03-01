package com.mycompany.app.Week2;

public class InitializationCleanupEx5 {
    public static class Dog {
        public void Bark() {
            System.out.println("Sủa!");
        }
    
        public void Bark(String sound) {
            System.out.println(sound + "!");
        }
    
        public void Bark(int times) {
            for (int i = 0; i < times; i++) {
                System.out.println("Sủa!");
            }
        }
    
        public void Bark(String sound, int times) {
            for (int i = 0; i < times; i++) {
                System.out.println(sound + "!");
            }
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        
        // Gọi các phiên bản khác nhau của phương thức Bark()
        dog.Bark();
        dog.Bark("Hú");
        dog.Bark(3);
        dog.Bark("Gâu", 2);
    }
}
