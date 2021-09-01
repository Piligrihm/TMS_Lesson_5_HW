package com.tms.array;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите жеалемый размер массива: ");
        try {
            int sizeArray = scanner.nextInt();
            int[] myArray = new int[sizeArray];

            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = (int) (1000 * Math.random());
            }
            System.out.println("Сгенерированный массив: " + Arrays.toString(myArray));
            for (int i = 0; i < myArray.length; i++) {
                if (i % 2 != 0) {
                    myArray[i] = 0;
                }
            }
            System.out.println("Полученный массив: " + Arrays.toString(myArray));
        } catch (InputMismatchException e) {
            System.out.println("Введенное занчение ошибочно!");
        } finally {
            scanner.close();
        }
    }
}
