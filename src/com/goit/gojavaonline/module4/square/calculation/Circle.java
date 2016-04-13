package com.goit.gojavaonline.module4.square.calculation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return new BigDecimal(Math.PI * Math.pow(radius, 2)).setScale(6, RoundingMode.HALF_UP).doubleValue();
    }
}

