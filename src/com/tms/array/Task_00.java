package com.tms.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для проверки:");
        boolean flag = false;
        try {
            int number = scanner.nextInt();
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = i * 2 + 35 * i;
                System.out.print(array[i] + " ");
            }
            for (int element : array) {
                if (number == element) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("\nЗаданное число входит в массив");
            } else {
                System.out.println("\nЗаданное число в массив не входит");
            }

        } catch (InputMismatchException e) {
            System.out.println("Введено недопустимое значение");

        } finally {
            scanner.close();
        }
    }
}

