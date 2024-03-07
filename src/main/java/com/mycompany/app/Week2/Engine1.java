package com.mycompany.app.Week2;

public class Engine1 {
    interface Disposable {
        void dispose();
    }

    static class Engine implements Disposable {
        public void start() {}
        public void rev() {}
        public void stop() {}
        public void service() {
            System.out.println("Engine service performed.");
        }

        @Override
        public void dispose() {
            System.out.println("Disposing engine.");
        }
    }

    static class Wheel implements Disposable {
        public void inflate(int psi) {}

        @Override
        public void dispose() {
            System.out.println("Disposing wheel.");
        }
    }

    static class Window implements Disposable {
        public void rollup() {}
        public void rolldown() {}

        @Override
        public void dispose() {
            System.out.println("Disposing window.");
        }
    }

    static class Door implements Disposable {
        public Window window = new Window();
        public void open() {}
        public void close() {}

        @Override
        public void dispose() {
            System.out.println("Disposing door.");
            window.dispose();
        }
    }

    static class Car implements Disposable {
        public Engine engine = new Engine();
        public Wheel[] wheel = new Wheel[4];
        public Door left = new Door();
        public Door right = new Door(); // 2-door

        public Car() {
            for (int i = 0; i < 4; i++) {
                wheel[i] = new Wheel();
            }
        }

        @Override
        public void dispose() {
            System.out.println("Disposing car.");
            engine.dispose();
            for (int i = 0; i < 4; i++) {
                wheel[i].dispose();
            }
            left.dispose();
            right.dispose();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        try {
            car.left.window.rollup();
            car.wheel[0].inflate(72);
            car.engine.service();
        } finally {
            car.dispose();
        }
    }
}