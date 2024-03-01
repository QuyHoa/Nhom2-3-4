package com.mycompany.app.Week2;

public class InitializationCleanupEx6 {
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

        // Hai phương thức Bark() nạp chồng có thứ tự đảo ngược so với nhau
        public void Bark(int times, String sound) {
            for (int i = 0; i < times; i++) {
                System.out.println(sound + "!");
            }
        }

        public void Bark(String sound, String name) {
            System.out.println(sound + ", " + name + "!");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        
        // Gọi các phiên bản khác nhau của phương thức Bark()
        dog.Bark();
        dog.Bark("Hú");
        dog.Bark(3);
        dog.Bark("Gâu", 2);

        // Gọi các phiên bản khác nhau của phương thức Bark() đã sửa đổi
        dog.Bark(2, "Sủa");
        dog.Bark("Sủa", "Rex");
    }
}
