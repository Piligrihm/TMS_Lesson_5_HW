package com.tms.additional_task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество месяцев: ");
        try {
            float deposit = 1254.25f;
            int month = scanner.nextInt();

            for (int i = 0; i < month; i++) {
                deposit = (float) (deposit + deposit * 0.07);
            }
            System.out.println("Окончательная сумма депозита с учетом указанного срока и процентов: " + deposit);
        } catch (InputMismatchException e) {
            System.out.println("Введенное кол-во месяцев - ошибочно");
        } finally {
            scanner.close();
        }
    }
}