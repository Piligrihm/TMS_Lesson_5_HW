package com.tms.array;

import java.util.Arrays;

public class Task_06 {
    public static void main(String[] args) {
        String[] names = {"Саша", "Дима", "Андрей", "Анастасия", "Даша", "Олег", "Диана", "Максим"};
        System.out.println("Заданный массив до сортировки: " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Заданный после сортировки: " + Arrays.toString(names));
    }
}
