package com.mycompany.app.Week2;

abstract class Shape {
    abstract double area();
    abstract double perimeter();

    // New method added to the base class
    void printMessage() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    double perimeter() {
        return 2 * (width + height);
    }
}

class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    // Override the printMessage() method only in Circle class
    @Override
    void printMessage() {
        System.out.println("This is a circle.");
    }
}

public class Polymorphismexample3 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 4);
        Shape circle = new Circle(3);

        rectangle.printMessage(); // Output: This is a shape.
        circle.printMessage();    // Output: This is a circle.
    }
}
