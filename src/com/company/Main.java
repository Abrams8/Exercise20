package com.company;

public class Main {

    public static void main(String[] args) {
        int array[] = {2, 5, 1, 5, 3, 7, 14, 1, 17, 9};
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
