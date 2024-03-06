package com.mycompany.app.Week2;

public class Rootex10 {
    class Component1 {
        public Component1(String message) {
            System.out.println("Component1 constructor called with message: " + message);
        }

        @Override
        public String toString() {
            return "Component1";
        }
    }

    class Component2 {
        public Component2(int value) {
            System.out.println("Component2 constructor called with value: " + value);
        }

        @Override
        public String toString() {
            return "Component2";
        }
    }

    class Component3 {
        public Component3(double number) {
            System.out.println("Component3 constructor called with number: " + number);
        }

        @Override
        public String toString() {
            return "Component3";
        }
    }

    class NestedRoot {
        private Component1 component1;
        private Component2 component2;
        private Component3 component3;

        public NestedRoot(String message, int value, double number) {
            component1 = new Component1(message);
            component2 = new Component2(value);
            component3 = new Component3(number);
            System.out.println("NestedRoot constructor called");

            System.out.println("Component1: " + component1.toString());
            System.out.println("Component2: " + component2.toString());
            System.out.println("Component3: " + component3.toString());
        }
    }

    public static void main(String[] args) {
        Rootex10 root = new Rootex10();
        root.new NestedRoot("Hello", 50, 3.14);
    }
}