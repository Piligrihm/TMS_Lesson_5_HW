package com.tms.control_flow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер цвета радуги (от 1 до 7):");
        try {

            int rainbowColor = scanner.nextInt();
            switch (rainbowColor) {
                case 1:
                    System.out.println("красный");
                    break;
                case 2:
                    System.out.println("оранжевый");
                    break;
                case 3:
                    System.out.println("желтый");
                    break;
                case 4:
                    System.out.println("зеленый");
                    break;
                case 5:
                    System.out.println("голубой");
                    break;
                case 6:
                    System.out.println("синий");
                    break;
                case 7:
                    System.out.println("фиолетовый");
                    break;
                default:
                    System.out.println("В радуге всего 7 цветов. Заданный цвет - не существует");
            }
        } catch (InputMismatchException e) {
            System.out.println("Введено неверное значение!");
        } finally {
            scanner.close();
        }
    }
}
