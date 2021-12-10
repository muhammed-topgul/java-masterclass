package com.muhammedtopgul.javamasterclass.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * @author muhammed-topgul
 * @since 06.11.2021 20:05
 */

public class ArraysDemo {

    private int[] intArray = new int[20];

    public static void main(String[] args) {
        ArraysDemo arraysDemo = new ArraysDemo();
        arraysDemo.initialize();
        arraysDemo.copy();
        arraysDemo.rangeCopy();
        arraysDemo.sort();
        arraysDemo.search(10);
        arraysDemo.fill(58);
    }

    public void initialize() {
        for (int i = 0; i < intArray.length; i++) {
            Random random = new Random();
            int randomInt = random.nextInt();
            int number = randomInt % 100;
            intArray[i] = number;
        }

        System.out.println("\nOriginal Array: ");
        print(intArray);
    }

    public void copy() {
        System.out.println("\nCopying the array: ");
        int[] copy = Arrays.copyOf(intArray, intArray.length);
        System.out.println("Whole copy: ");
        print(copy);

        copy = Arrays.copyOf(intArray, 5);
        System.out.println("Only 0 to 4: ");
        print(copy);
    }

    public void rangeCopy() {
        System.out.println("\nCopying the range of the array: ");
        int[] copyRange = Arrays.copyOfRange(intArray, 5, 10);
        System.out.println("Range 5 to 10: ");
        print(copyRange);
    }

    public void fill(int key) {
        System.out.println("\nFilling the array with " + key + " : ");
        Arrays.fill(intArray, key);
        print(intArray);
    }

    public void sort() {
        System.out.println("\nSorting the array: ");
        Arrays.sort(intArray);
        print(intArray);
    }

    public void search(int key) {
        System.out.println("\nSearching the key " + key + " : ");
        int index = Arrays.binarySearch(intArray, key);
        System.out.println("Index of " + key + " : " + index);
    }

    private void print(int[] array) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if (i != array.length - 1) {
                builder.append(", ");
            }
        }

        System.out.println(builder + "\n");
    }
}
