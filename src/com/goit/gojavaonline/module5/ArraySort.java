package com.goit.gojavaonline.module5;

public class ArraySort {
    public static void main(String[] args) {
        int[] intArray = {15, 32, 44, 55, 22, -13, 186, 0};

        for (int i = 0; i < intArray.length; i++) {
            int min = intArray[i];
            int min_i = i;

            for (int j = i+1; j < intArray.length; j++) {
                if (intArray[j] < min) {
                    min = intArray[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tempArray = intArray[i];
                intArray[i] = intArray[min_i];
                intArray[min_i] = tempArray;
            }
        }
//        for (int element : intArray)
//        System.out.println(element);
    }

}

// Выбрать один из алгоритмов сортировки массивов и реализовать его