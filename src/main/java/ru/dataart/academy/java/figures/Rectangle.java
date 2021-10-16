package ru.dataart.academy.java.figures;

public class Rectangle extends Figure {
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double findPerimeter() {
        return (height + width) * 2;
    }
    public double findArea() {
        return height * width;
    }
}