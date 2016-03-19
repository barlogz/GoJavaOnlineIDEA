package com.goit.gojavaonline.module6.square.calculation;

public class Triangle extends Figure {
    private double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double square() {
        if (sideA<0 || sideB<0 || sideC<0) {
            throw new IllegalArgumentException("Введено отрицательное значение");
        }

        double perimeter = (0.5) * (sideA + sideB + sideC);
        return Math.sqrt(perimeter*(perimeter - sideA)*(perimeter - sideB)*(perimeter - sideC));
    }
}
