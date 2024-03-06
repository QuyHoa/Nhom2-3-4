package com.mycompany.app.Week2;

public class Root {
    class Component1 {
        public Component1() {
            System.out.println("Component1 constructor called");
        }
        
        @Override
        public String toString() {
            return "Component1";
        }
    }

    class Component2 {
        public Component2() {
            System.out.println("Component2 constructor called");
        }
        
        @Override
        public String toString() {
            return "Component2";
        }
    }

    class Component3 {
        public Component3() {
            System.out.println("Component3 constructor called");
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

        public NestedRoot() {
            component1 = new Component1();
            component2 = new Component2();
            component3 = new Component3();
            System.out.println("NestedRoot constructor called");

            // Use the component1, component2, and component3 fields
            System.out.println("Component1: " + component1.toString());
            System.out.println("Component2: " + component2.toString());
            System.out.println("Component3: " + component3.toString());
        }
    }

    public static void main(String[] args) {
        Root root = new Root();
        root.new NestedRoot();
    }
}