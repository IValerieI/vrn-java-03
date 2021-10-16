package ru.dataart.academy.java.figures;

public class Circle extends Figure {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double findPerimeter() {
        return 2 * Math.PI * radius;
    }
    public double findArea() {
        return Math.PI * radius * radius;
    }
}