package com.muhammedtopgul.javamasterclass.algorithms;

import java.util.Scanner;

/**
 * @author muhammed-topgul 
 * @since 02.11.2021 22:35
 */

public class PrimeNumber {

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        try {
            System.out.print("Please enter an number that bigger than 1: ");
            n = scanner.nextInt();
            if (n < 2) {
                throw new UnsupportedOperationException("N must be bigger than 2");
            }
            System.out.println(n + " prime result is " + primeNumber.isPrime(n));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    boolean isPrime(int n) {
        boolean prime = true;
        int i = 2;
        int upperBound = (int) (Math.sqrt(n) + 1);
        for (; i < upperBound; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (!prime) {
            System.out.println("First divider: " + i);
        }

        return prime;
    }
}
