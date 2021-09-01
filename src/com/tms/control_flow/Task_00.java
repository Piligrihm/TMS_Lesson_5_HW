package com.tms.control_flow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца...");
        try {

            int month = scanner.nextInt();
            switch (month) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("В году всего 12 месяцев. Месяца с заланный номером не существует!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Введено неверное значение!");
        } finally {
            scanner.close();
        }
    }
}


