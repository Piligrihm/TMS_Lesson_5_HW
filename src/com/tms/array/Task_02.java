package com.tms.array;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");

        try {
            int maxNumber = 0;
            int minNumber = 0;
            int sizeArray = scanner.nextInt();
            int[] myArray = new int[sizeArray];

            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = (int) (1000 * Math.random());
                minNumber = myArray[0];
                if (maxNumber <= myArray[i]) {
                    maxNumber = myArray[i];
                } else if (minNumber >= myArray[i]) {
                    minNumber = myArray[i];
                }
            }
            System.out.println(Arrays.toString(myArray));
            System.out.println("Мин " + minNumber);
            System.out.println("Макс " + maxNumber);
            System.out.println("Среднее " + (minNumber + maxNumber) / 2);
        } catch (InputMismatchException e) {
            System.out.println("Exception");
        } finally {
            scanner.close();
        }
    }
}