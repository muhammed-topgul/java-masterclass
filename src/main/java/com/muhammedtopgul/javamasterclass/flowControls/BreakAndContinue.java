package com.muhammedtopgul.javamasterclass.flowControls;

/**
 * @author muhammed-topgul 
 * @since 01.11.2021 22:09
 */

public class BreakAndContinue {

    public static void main(String[] args) {
        int search = 88;

        int[][] array = {
                {32, 1, 25, 19},
                {59, 51, 5, 88},
                {89, 12, 37, 9},
        };

        boolean founded = false;

        here:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == search) {
                    founded = true;
                    System.out.println("Found at i=" + i + ". j=" + j + ".");
                    break here;
                }
            }

            System.out.println("--------------");
        }

        if (!founded) {
            System.out.println("Not found");
        }
    }
}
