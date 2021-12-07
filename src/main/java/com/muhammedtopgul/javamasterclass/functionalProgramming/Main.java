package com.muhammedtopgul.javamasterclass.functionalProgramming;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author muhammed-topgul
 * @created at 07.12.2021 09:47
 */

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        Arrays.stream(array)
                .filter(x -> x % 2 == 0)
                .map(n -> n * n)
                .average()
                .ifPresent(System.out::println);

        IntStream filteredArray = Arrays.stream(array)
                .filter(x -> x % 2 == 0);

        filteredArray.forEach(System.out::println);
    }
}
