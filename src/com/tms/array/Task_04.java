package com.tms.array;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("введите длину массива:");
            int sizeArray = 0;
            int[] myArray = new int[0];
            int count = 0;

            do {
                sizeArray = scanner.nextInt();
                if (sizeArray > 5 && sizeArray <= 10) {
                    myArray = new int[sizeArray];
                    for (int i = 0; i < myArray.length; i++) {
                        myArray[i] = (int) (Math.random() * 100);
                        if (myArray[i] % 2 == 0) {
                            count++;
                        }
                    }
                    System.out.println("Первый полученный массив: " + Arrays.toString(myArray));
                } else {
                    System.out.println("Вы ввели недопустимый размер массива. Поробуйте еще раз");
                }
            } while (sizeArray <= 5 || sizeArray > 10);

            int[] myArray2 = new int[count];
            int index = 0;
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] % 2 == 0) {
                    myArray2[index] = myArray[i];
                    index++;
                }
            }
            System.out.println("Массив из четных чисел первого: " + Arrays.toString(myArray2));

        } catch (InputMismatchException e) {
            System.out.println("Вы ввели недопустимое значение");
        } finally {
            scanner.close();
        }
    }
}
