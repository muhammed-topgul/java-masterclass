package com.muhammedtopgul.javamasterclass.arrays;

/**
 * @author muhammed-topgul created at 02/11/2021 23:16
 */

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[3];
        intArray[0] = 5;
        intArray[1] = 95;
        intArray[2] = 586;
        for (int i : intArray) {
            System.out.println(i);
        }

        System.out.println("\n");

        Object[] objectArray = new Object[4];
        objectArray[0] = 41;
        objectArray[1] = "Muhammed";
        objectArray[2] = 54.9;

        for (Object o : objectArray) {
            System.out.println(o);
        }
    }
}
