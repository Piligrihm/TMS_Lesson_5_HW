package com.tms.control_flow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите темепературу ддля проверки:");
        try {
            int temperature = scanner.nextInt();
            if (temperature > -5) {
                System.out.println("Тепло");
            } else if (temperature <= -5 && temperature > -20) {
                System.out.println("Нормально");
            } else if (temperature <= -20) {
                System.out.println("Холодно");
            }
        } catch (InputMismatchException e) {
            System.out.println("Введено недопустимое значение");
        } finally {
            scanner.close();
        }
    }
}
