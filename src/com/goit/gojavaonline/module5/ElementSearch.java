package com.goit.gojavaonline.module5;

import java.util.Arrays;

public class ElementSearch {
    public static void main(String[] args) {
        int[] intArray = {1, 4, 3, 2, 5, -20, 805, 105};

//        Arrays.sort(intArray);
        ArraySort.arraySortMethod(intArray);
        System.out.println("Min element: " + intArray[0]);
        System.out.println("Max element: " + intArray[intArray.length-1]);

        for (int element : intArray) {
            System.out.println(element);
            System.out.println(Arrays.toString(intArray));
        }
    }

}


//Создать класс, который осуществляет поиск максимального и минимального элемента в массиве из целых чисел (int[]).