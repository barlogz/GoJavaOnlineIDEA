package com.goit.gojavaonline.module4.square.calculation;

public class Main {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle(1.5,2.12);
        System.out.println("Площадь прямоугольника "+rectangle.square());

        Figure circle = new Circle(1.5);
        System.out.println("Площадь круга "+circle.square());

        Figure triangle = new Triangle(1.5,2.5,3.4);
        System.out.println("Площадь триугольника "+triangle.square());

    }
}