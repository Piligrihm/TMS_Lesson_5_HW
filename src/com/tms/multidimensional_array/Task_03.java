package com.tms.multidimensional_array;

public class Task_03 {
    public static void main(String[] args) {
//объявляем и создаём массив, указывая только количество строк
        int[][] myArray = new int[5][];

//инициализируем массив, заполняя его массивами разной длины
        myArray[0] = new int[]{1, 2, 3, 4};
        myArray[1] = new int[]{2, 3, 4, 0};
        myArray[2] = new int[]{1, 2, 3, 78};
        myArray[3] = new int[]{1, 2, 32, 45};
        myArray[4] = new int[]{1, 4, 3, 6};

//выведем получившийся двумерный массив на экран
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(" " + myArray[i][j] + " ");
            }
            System.out.println();
        }

        // Подсчитываем сумму всех элементов в заданном массиве
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                sum = sum + myArray[i][j];
            }
        }
        System.out.println("Сумма всех элементов массива равна: " + sum);
    }
}
