package com.tms.control_flow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        try {
            int number = scanner.nextInt();
            if (number % 2 > 0) {
                System.out.println("Введенное счисло является не четным");
            } else {
                System.out.println("Введенное число является четным");
            }
            scanner.close();
        } catch (InputMismatchException exception) {
            System.out.println("Введено неверное значение!");
        } finally {
            scanner.close();
        }
    }
}
