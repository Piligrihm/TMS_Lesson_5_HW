package com.tms.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_01 {
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

        } catch (InputMismatchException e) {
            System.out.println("Введено недопустимое значение");

        } finally {
            scanner.close();
        }
    }
}
