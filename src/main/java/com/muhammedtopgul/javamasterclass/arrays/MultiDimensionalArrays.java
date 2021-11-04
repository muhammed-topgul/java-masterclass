package com.muhammedtopgul.javamasterclass.arrays;

/**
 * @author muhammed-topgul created at 04/11/2021 17:02
 */

public class MultiDimensionalArrays {

    public static void main(String[] args) {
        int[][] twoDimensions = new int[3][];

        twoDimensions[0] = new int[]{1, 2, 3};
        twoDimensions[1] = new int[]{4, 5};
        twoDimensions[2] = new int[]{6, 7, 8, 9};

        for (int[] ints : twoDimensions) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println("\n");

        int[][][] threeDimensions = {{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}}};

        for (int[][] threeDimension : threeDimensions) {
            for (int[] ints : threeDimension) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                System.out.println();
            }
        }
    }
}
