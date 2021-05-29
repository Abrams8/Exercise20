package com.company;

public class Main {

    public static void main(String[] args) {
        int array[] = {2, 5, 6, 15, 3, 7, 14, 17, 11, 12};
        int index = 0;
        int maxElement = -999999999;
        int maxElementIndex = 0;
        for (; index < array.length; index++) {
            if (maxElement < array[index]) {
                maxElement = array[index];
                maxElementIndex = index;
            }
        }
        System.out.println("Индекс максимального элемента массива = " + maxElementIndex);
    }
}
