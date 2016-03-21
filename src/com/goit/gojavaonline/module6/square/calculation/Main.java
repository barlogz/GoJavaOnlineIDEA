package com.goit.gojavaonline.module6.square.calculation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Расчет площади какой фигуры Вы хотите выполнить?");
        System.out.println("Введите: 1 для расчета площади прямоугольника, " +
                "2 - для площади круга, 3 - для площади треугольника");

        Scanner sss = new Scanner(System.in);
        int switcher = sss.nextInt();
        switch (switcher) {

            case 1:
                try {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Расчет площади прямоугольника. Введите длину стороны 1");
                    double a = scanner.nextDouble();

                    System.out.println("Введите длину стороны 2");
                    double b = scanner.nextDouble();

                    System.out.println("Вы ввели стороны " + a + " и " + b);

                    Rectangle rectangle = new Rectangle(a, b);
                    System.out.println("Площадь прямоугольника " + rectangle.square());

                } catch (IllegalArgumentException x) {
                    System.out.println("Ошибка: " + x);
                } catch (InputMismatchException e) {
                    System.out.println("|ERROR| Данные введены неверно! " + e);
                }
                break;


            case 2:
                try {
                    Scanner scannerForCircle = new Scanner(System.in);

                    System.out.println("Расчет площади круга. Введите радиус");
                    double a = scannerForCircle.nextDouble();

                    System.out.println("Вы ввели радиус " + a);

                    Figure circle = new Circle(a);
                    System.out.println("Площадь круга " + circle.square());

                } catch (IllegalArgumentException x) {
                    System.out.println("Ошибка: " + x);
                } catch (InputMismatchException e2) {
                    System.out.println("|ERROR| Данные введены неверно! " + e2);
                }
                break;

            case 3:
                try {
                    Scanner scannerForTriangle = new Scanner(System.in);

                    System.out.println("Расчет площади треугольника. Введите длину стороны 1");
                    double a = scannerForTriangle.nextDouble();

                    System.out.println("Введите длину стороны 2");
                    double b = scannerForTriangle.nextDouble();

                    System.out.println("Введите длину стороны 3");
                    double c = scannerForTriangle.nextDouble();

                    System.out.println("Вы ввели стороны " + a + " и " + b + " и " + c);


                    Figure triangle = new Triangle(a, b, c);
                    System.out.println("Площадь триугольника " + triangle.square());
                } catch (IllegalArgumentException x) {
                    System.out.println("Ошибка: " + x);
                } catch (InputMismatchException e) {
                    System.out.println("|ERROR| Данные введены неверно! " + e);
                }
                break;
        }

    }
}