package com.goit.gojavaonline.module4.temp.grade.converter;

public class TemperatureScaleConvert {
    public static void main(String[] args) {

//        System.out.println(fahrenheitToCelsiusConvert(83));
//        System.out.println(celsiusToFahrenheitConvert(21));
    }

        public static int fahrenheitToCelsiusConvert(int fahrenheit){
            int celsius = 5 * (fahrenheit - 32) / 9;
            return celsius;
        }

        public static int celsiusToFahrenheitConvert(int celsius){
            int fahrenheit = celsius * 9/5 + 32;
            return fahrenheit;
        }
    }

