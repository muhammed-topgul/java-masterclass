package com.muhammedtopgul.javamasterclass.algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author muhammed-topgul 
 * @since 06.11.2021 21:11
 * https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
 */

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an number that bigger than 1: ");
        int n = scanner.nextInt();

        sieveOfEratosthenes.countNumberOfPrimesUpTo(n);
    }

    void countNumberOfPrimesUpTo(int n) {
        boolean[] list = new boolean[n + 1];
        Arrays.fill(list, true);
        Arrays.fill(list, 0, 2, false);

        for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
            if (list[i]) {
                for (int j = 2; (i * j <= n); j++) {
                    int line = i * j;
                    list[line] = false;
                }
            }
        }

        int countOfPrimes = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i]) {
                countOfPrimes++;
                System.out.println(i + ": " + list[i]);
            }
        }
        System.out.println("Count of primes: " + countOfPrimes);
    }
}
