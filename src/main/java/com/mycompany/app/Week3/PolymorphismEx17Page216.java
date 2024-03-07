package com.mycompany.app.Week3;

public class PolymorphismEx17Page216 {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[3];
        
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();
        
        for (Cycle cycle : cycles) {
            cycle.balance();
        }
        
        // Downcast và gọi balance() cho từng phần tử
        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
        // Không thể gọi balance() cho Tricycle vì nó không có phương thức balance()
    }
}

class Cycle {
    void balance() {
        System.out.println("Balancing the cycle.");
    }
}

class Unicycle extends Cycle {
    void balance() {
        System.out.println("Balancing the unicycle.");
    }
}

class Bicycle extends Cycle {
    void balance() {
        System.out.println("Balancing the bicycle.");
    }
}

class Tricycle extends Cycle {
    // Tricycle không có phương thức balance()
}
