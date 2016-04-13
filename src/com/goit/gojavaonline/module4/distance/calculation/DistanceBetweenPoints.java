package com.goit.gojavaonline.module4.distance.calculation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DistanceBetweenPoints {

    public static void main(String[] args){

        System.out.println(calculateDistanceBetweenPoints(-2.3, 8.5, 4.0, 0.7));
    }
        public static double calculateDistanceBetweenPoints(double x1, double x2, double y1, double y2){
            return new BigDecimal(Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)))
                    .setScale(3, RoundingMode.HALF_UP).doubleValue();

        }

}
