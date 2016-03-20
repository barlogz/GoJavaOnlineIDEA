package com.goit.gojavaonline.module6.square.calculation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Расчет площади прямоугольника. Введите длину стороны 1");
            double a = scanner.nextDouble();

            System.out.println("Введите длину стороны 2");
            double b = scanner.nextDouble();

            System.out.println("Вы ввели стороны " + a + " и " + b);

            try {
                Rectangle rectangle = new Rectangle(a, b);
                System.out.println("Площадь прямоугольника " + rectangle.square());
            } catch (IllegalArgumentException x) {
                System.out.println("Ошибка: " + x);
            }
        } catch (InputMismatchException e) {
            System.out.println("|ERROR| Данные введены неверно! " + e);
        }




        try {
            Scanner scanner2 = new Scanner(System.in);

            System.out.println("Расчет площади круга. Введите радиус");
            double a = scanner2.nextDouble();

            System.out.println("Вы ввели радиус " + a);

            try {
                Figure circle = new Circle(a);
                System.out.println("Площадь круга " + circle.square());
            } catch (IllegalArgumentException x) {
                System.out.println("Ошибка: " + x);
            }

        } catch (InputMismatchException e2) {
            System.out.println("|ERROR| Данные введены неверно! " + e2);
        }

        try {
            Scanner scanner3 = new Scanner(System.in);

            System.out.println("Расчет площади треугольника. Введите длину стороны 1");
            double a = scanner3.nextDouble();

            System.out.println("Введите длину стороны 2");
            double b = scanner3.nextDouble();

            System.out.println("Введите длину стороны 3");
            double c = scanner3.nextDouble();

            System.out.println("Вы ввели стороны " + a + " и " + b + " и " + c);

            try {
                Figure triangle = new Triangle(a, b, c);
                System.out.println("Площадь триугольника " + triangle.square());
            } catch (IllegalArgumentException x) {
                System.out.println("Ошибка: " + x);
            }

        } catch (InputMismatchException e) {
            System.out.println("|ERROR| Данные введены неверно! " + e);
        }
    }

}
