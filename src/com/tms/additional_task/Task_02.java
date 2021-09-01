package com.tms.additional_task;

public class Task_02 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int columns;
        String result = "";
        System.out.println("-----------------------------------------------------------------------------");
        for (int lines = 1; lines <= 18; lines++) {
            // цикл ограничивает строку 4-мя столбиками
            for (columns = 0; columns < 5; columns++) {
                result = result + (a + " x " + b + " = " + (a * b) + "\t|\t");
                a++;
            }
            System.out.println(result);
            if (lines < 9) {
                a = 1;
                b++;
                result = "";
            }
            if (lines == 9) {
                System.out.println("-----------------------------------------------------------------------------");
                result = "";
                b = 1;
            }
            if (lines > 9) {
                a = 6;
                b++;
                result = "";
            }
        }
        System.out.println("-----------------------------------------------------------------------------");
    }
}
