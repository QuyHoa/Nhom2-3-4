package com.mycompany.app.Week2;

class Engine {
    public void start() {}
    public void rev() {}
    public void stop() {}
    public void service() {
        System.out.println("Engine service performed.");
    }
}

class Wheel {
    public void inflate(int psi) {}
}

class Window {
    public void rollup() {}
    public void rolldown() {}
}

class Door {
    public Window window = new Window();
    public void open() {}
    public void close() {}
}

class Car {
    public Engine engine = new Engine();
    public Wheel[] wheels = new Wheel[4];
    public Door leftDoor = new Door();
    public Door rightDoor = new Door();

    public Car() {
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.leftDoor.window.rollup();
        car.wheels[0].inflate(72);
        car.engine.service();
    }
}