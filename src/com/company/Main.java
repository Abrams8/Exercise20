package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {26, 86, 79, 56, 48, 25, 36, 48, 75, 83};
        findMaxElementIndex(array);

    }

    public static void findMaxElementIndex(int[] array) {
        int i = 0;
        int maxElement = -999999999;
        int maxElementIndex = 0;
        for (; i < array.length; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
                maxElementIndex = i;
            }
        }
        System.out.print("Индекс(ы) максимального элемента массива = ");
        for (i = 0; i < array.length; i++) {          //проверка на случай не одного макс значения :)
            if (array[i] == maxElement) {
                System.out.print(i + " ");
            }
        }
    }
}
