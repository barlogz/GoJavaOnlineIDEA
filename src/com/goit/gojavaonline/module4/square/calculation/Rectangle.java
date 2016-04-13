package com.goit.gojavaonline.module4.square.calculation;

public class Rectangle extends Figure{
    private double sideA, sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double square() {
        return sideA * sideB;
    }

}
