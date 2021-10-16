package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Circle;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;

public class Main{
    public static void main(String[] args) {
        System.out.print("Task for Java OOP");

        Circle c = new Circle(10);
        Circle c1 = new Circle(5.8);
        Rectangle r = new Rectangle(4.3, 2.5);
        Rectangle r1 = new Rectangle(42, 27.3);

        Figure[] figures = {c, r, c1, r1};
        Calculator calc = new Calculator();
        System.out.println(calc.sumOfAreas(figures));
    }
}