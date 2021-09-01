package com.tms.multidimensional_array;

import java.util.Arrays;

public class Task_05 {
    public static void main(String[] args) {

        int[][] myArray = new int[5][5];

        myArray[0] = new int[]{1, 7, 3, 2, 1};
        myArray[1] = new int[]{2, 3, 4, 0, 9};
        myArray[2] = new int[]{3, 1, 8, 5, 3};
        myArray[3] = new int[]{4, 2, 4, 6, 1};
        myArray[4] = new int[]{5, 4, 3, 6, 2};

        System.out.println("Заданный массив: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(Arrays.toString(myArray[i]));
        }
        System.out.println();

        System.out.println("Массив с отсортированными строками: \n");
        for (int i = 0; i < myArray.length; i++) {
            Arrays.sort(myArray[i]);
            System.out.println(Arrays.toString(myArray[i]));
        }
    }
}
