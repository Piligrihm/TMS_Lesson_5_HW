package com.tms.array;

import java.util.Arrays;

public class Task_03 {
    public static void main(String[] args) {

        int[] array1 = {1, 3, 6, 12, 8};
        int[] array2 = {1, 3, 5, 12, 8};

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        if (average(array1) > average(array2)) {
            System.out.println("Среднее арифметическое первого массива оказалось больше");
        } else if (average(array1) < average(array2)) {
            System.out.println("Среднее арифметическое второго массива оказалось больше");
        } else {
            System.out.println("Средние арифметические первого и второго массивов оказались равны");
        }
    }

    /**
     * Метод позволяяет посчитать среднее арифметическое все элементов массива
     *
     * @param array - принимаемый на вход массив
     * @return - среднее арифметическое
     */
    private static int average(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        return result / array.length;
    }
}
