package com.goit.gojavaonline.module5;

import java.util.Arrays;

public class ElementSearch {

    public static void main(String[] args) {
        int[] intArray = {1, 4, 3, 2, 5, -20, 805, 105};

        System.out.println("Min element: " + minimumElementSearch(intArray));
        System.out.println("Max element: " + maximumElementSearch(intArray));
        System.out.println("from array: " + "\n" + Arrays.toString(intArray));
    }

    private static int minimumElementSearch(int[] intArray) {
//        Arrays.sort(intArray);
        ArraySort.arraySortMethod(intArray);
        return intArray[0];
    }

    private static int maximumElementSearch(int[] intArray) {
//        Arrays.sort(intArray);
        ArraySort.arraySortMethod(intArray);
        return intArray[intArray.length - 1];
    }
}


//Создать класс, который осуществляет поиск максимального и минимального элемента в массиве из целых чисел (int[]).