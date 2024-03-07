package com.mycompany.app.Week2;

class Shape {
    void draw() {}
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }
}

class Pentagon extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Pentagon");
    }
}

class Polymorphism {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape pentagon = new Pentagon();
        
        Shape[] shapes = {circle, square, triangle, pentagon};
        
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
