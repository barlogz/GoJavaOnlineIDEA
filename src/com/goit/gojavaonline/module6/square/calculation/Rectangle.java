package com.goit.gojavaonline.module6.square.calculation;

public class Rectangle extends Figure {
    private double sideA, sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double square() {
        if (sideA<0 || sideB<0) {
            throw new IllegalArgumentException("Введено отрицательное значение");
        }

        return sideA * sideB;

    }

}
