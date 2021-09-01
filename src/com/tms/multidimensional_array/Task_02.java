package com.tms.multidimensional_array;

import java.util.Arrays;

public class Task_02 {
    public static void main(String[] args) {
/**
 * Для умножения одной матрицы на вторую, обязательно совпадение кол-ва строк первой матрицы с кол-вом столбцов второй.
 * И кол-во столбцов первой с кол-во строк второй.
 */
        //объявляем две матрицы
        int[][] matrix1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] matrix2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        System.out.println("Первая матрица: \n" + Arrays.deepToString(matrix1));
        System.out.println("Вторая матрица: \n" +  Arrays.deepToString(matrix2));

        //умножаем матрицу, одну на другую
        int[][] matrix3 = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix3[0].length; i++) {
            for (int j = 0; j < matrix3.length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    matrix3[i][j] = matrix3[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        //вывод на экран

        System.out.print("Результат умножения акрвой матрицы на вторую: \n" + Arrays.deepToString(matrix3));
    }
}


