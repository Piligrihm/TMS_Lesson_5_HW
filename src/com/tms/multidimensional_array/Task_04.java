package com.tms.multidimensional_array;

import java.util.Arrays;

public class Task_04 {
    public static void main(String[] args) {
        //объявляем и создаём массив
        int[][] myArray = new int[5][5];
        String[][] myArray1 = new String[5][5];

        //инициализируем массив

        myArray[0] = new int[]{1, 2, 3, 4, 8};
        myArray[1] = new int[]{2, 3, 4, 0, 9};
        myArray[2] = new int[]{1, 2, 3, 6, 3};
        myArray[3] = new int[]{1, 2, 4, 6, 1};
        myArray[4] = new int[]{1, 4, 3, 6, 2};


        System.out.println("Заданный массив: \n");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(" " + myArray[i][j] + " ");
            }
            System.out.println();
        }

        //заполняем второй массив

        for (int i = 0; i < myArray1.length; i++) {
            for (int j = 0; j < myArray1[i].length; j++) {
                myArray1[i][j] = " ";
            }
        }

        for (int i = 0, j = 0, k = myArray.length - 1; i < myArray.length; i++, j++, k--) {
            myArray1[i][j] = " " + myArray[i][j];
            myArray1[i][k] = "" + myArray[i][k];
        }

        System.out.println("\nДиагонали заданного массива: \n");

        for (int i = 0; i < myArray1.length; i++) {
            for (int j = 0; j < myArray1[i].length; j++) {
                System.out.print(" " + myArray1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
