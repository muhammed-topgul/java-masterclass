package com.muhammedtopgul.javamasterclass.oop.basic;

/**
 * @author muhammed-topgul 
 * @created at 07.11.2021 20:43
 */

public class VarArgs {

    public static void main(String[] args) {
        average(1, 2, 3, 4, 5);
        average(new int[]{1, 2, 3, 4, 5});
        int[] array = {5, 9, 13};
        average(array);
        average(new int[3]);
    }

    public static void average(int... numbers) {
        System.out.println("Type: " + numbers.getClass().getSimpleName());
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;
        System.out.println("Average: " + average + "\n");
    }
}
