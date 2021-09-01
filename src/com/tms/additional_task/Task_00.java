package com.tms.additional_task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_00 {
    public static void main(String[] args) {

        int number;
        int a = 0;
        int b = 0;
        int c = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество значений");
        try {
            number = scanner.nextInt();
            System.out.println("Серия чисел Фибоначчи: ");
            for (int i = 0; i < number; i++) {
                a = b;
                b = c;
                c = a + b;
                System.out.print(a + " ");
            }

        } catch (InputMismatchException e) {
            System.out.println("Допущена ошибка при вводе");
        } finally {
            scanner.close();
        }

    }

}

