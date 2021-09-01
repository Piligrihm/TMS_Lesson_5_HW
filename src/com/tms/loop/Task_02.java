package com.tms.loop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое, положительное число:");
        try {
            int result = 0;
            int number = scanner.nextInt();
            for (int i = 1; i <= number; i++){
                result = result+i;
            }
            System.out.println(result);

        } catch (InputMismatchException e) {
            System.out.println("Ведено недопустимое значение");
        } finally {
            scanner.close();
        }
    }
}
