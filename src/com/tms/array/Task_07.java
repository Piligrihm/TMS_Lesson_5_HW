package com.tms.array;

import java.util.Arrays;

public class Task_07 {
    public static void main(String[] args) {

        System.out.println("!!! Пузырьковая сортировка !!!");

        int[] arr1 = {1, 6, 14, 4, 3, 2};
        System.out.println("\nЗаданный массив до сортировки - " + Arrays.toString(arr1));
        for (int elements : arr1) {
            bubbleSort(arr1);
        }
        System.out.println("Заданный после сортировки - " + Arrays.toString(arr1));
    }

    /**
     * Метод позволяет отсортировать массив "пузырьком"
     *
     * @param array - принимаемый на вход массив
     */
    public static void bubbleSort(int[] array) {
        // i - номер прохода
        for (int i = 0; i < array.length - 1; i++) {
            // внутренний цикл прохода
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) { // если предпоследний элемент больше последнего
                    int tempVar = array[j - 1]; // записываем значение предпоследнего в о временную переменную
                    array[j - 1] = array[j]; // Присваиваем значение последнего пердпоследнему
                    array[j] = tempVar; // Присваиваем последнему значение временной перменной
                }
            }
        }
    }
}
