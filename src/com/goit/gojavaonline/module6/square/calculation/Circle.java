package com.goit.gojavaonline.module6.square.calculation;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    double square() {
        if (radius<0) {
            throw new IllegalArgumentException("Введено отрицательное значение");
        }
        return Math.PI * Math.pow(radius, 2);
    }
}


