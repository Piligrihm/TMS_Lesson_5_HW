package com.tms.control_flow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите номер месяца...");
            int month = scanner.nextInt();

            if (month > 0 && month < 3 || month == 12) {
                System.out.println("Зима");
            } else if (month > 2 && month < 6) {
                System.out.println("Весна");
            } else if (month > 5 && month < 9) {
                System.out.println("Лето");
            } else if (month > 8 && month < 12) {
                System.out.println("Осень");
            } else {
                System.out.println("В году всего 12 месяцев. Месяца с заланный номером не существует!");
            }
        } catch (
                InputMismatchException e) {
            System.out.println("Введено неверное значение!");
        } finally {
            scanner.close();
        }

    }
}

