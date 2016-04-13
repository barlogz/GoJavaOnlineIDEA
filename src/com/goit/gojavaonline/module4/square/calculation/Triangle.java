package com.goit.gojavaonline.module4.square.calculation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle extends Figure {
    private double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double square() {
        double perimeter = (0.5) * (sideA + sideB + sideC);
        return new BigDecimal(Math.sqrt(perimeter * (perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC)))
                .setScale(6, RoundingMode.HALF_UP).doubleValue();
    }
}
