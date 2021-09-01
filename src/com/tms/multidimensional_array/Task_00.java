package com.tms.multidimensional_array;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_00 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, на которое будет увеличен каждый элемент массива: ");
        try {
            int a = 3;
            int b = 3;
            int c = 3;
            int stepNumber = scanner.nextInt();
            int[][][] array = new int[a][b][c];
            System.out.println("Пустой массив: ");
            System.out.println(Arrays.deepToString(array));
            System.out.println();

            //Заполняем массив псевдо случаными целыми числами от 0 до 100
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    for (int k = 0; k < c; k++) {
                        var i1 = array[i][j][k] += (int) (Math.random() * 100);
                    }
                }
            }
            System.out.println("Массив, заролненный случайными значениями: ");
            System.out.println(Arrays.deepToString(array));
            System.out.println();
            // Проходим по массиву и увеличиваем каждый элемент на заданную величину
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    for (int k = 0; k < c; k++) {
                        var i1 = array[i][j][k] += stepNumber;
                    }
                }
            }
            System.out.println("Массив, в котором все знанчения были увеличены на заданное число: ");
            System.out.println(Arrays.deepToString(array));

        } catch (InputMismatchException e) {
            System.out.println("Введенное значение не верно!");
        } finally {
            scanner.close();
        }
    }
}
