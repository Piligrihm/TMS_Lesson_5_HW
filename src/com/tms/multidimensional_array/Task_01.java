package com.tms.multidimensional_array;

import java.util.Arrays;

public class Task_01 {
    public static void main(String[] args) {
        // создаем и заполняем двумерный массив 8х8 согласно цвету ячеек шахматной доски
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W";
                else chessBoard[i][j] = "B";
            }
        }
        // выводим в консоль
        for (int i = 0; i < chessBoard.length; i++) {
            System.out.println(Arrays.toString(chessBoard[i]));
        }
    }
}
