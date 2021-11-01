package com.muhammedtopgul.javamasterclass.algorithms;

import java.util.Scanner;

/**
 * @author muhammed-topgul created at 01/11/2021 23:03
 */

public class MonteCarloPI {

    public static void main(String[] args) {
        System.out.print("Enter point count: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int numberInCircle = 0;

        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();
            double distance = (x * x) + (y * y);
            if (distance <= 1) {
                numberInCircle++;
            }
        }

        double myPI = 4.0 * numberInCircle / n;
        System.out.println("My PI: " + myPI);
        System.out.println("Java's PI: " + Math.PI);
    }
}
