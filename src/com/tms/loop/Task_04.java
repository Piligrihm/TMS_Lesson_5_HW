package com.tms.loop;

public class Task_04 {
    public static void main(String[] args) {
        int number = 5;
        int i = 0;
        do {
            number = number - 5;
            System.out.println(number);
            i++;
        } while (i < 10);
    }
}
