package com.muhammedtopgul.javamasterclass.exceptions;

import java.io.IOException;

/**
 * @author muhammed-topgul 
 * @since 02.12.2021 15:55
 */

public class TryCatchFinally {

    public static void main(String[] args) {
        TryCatchFinally tryCatchFinally = new TryCatchFinally();

        int var1 = 10;
        int var2 = 1;
        try {
            System.out.println(tryCatchFinally.divide(var1, var2));
            System.out.println("After divide()");
        } catch (ArithmeticException | IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("In finally...");
        }
    }

    public double divide(int arg1, int arg2) throws ArithmeticException, IOException {
        if (arg2 == 0) {
            throw new ArithmeticException("Cannot divide to 0");
        }

        if (Math.random() < 0.5) {
            throw new IOException();
        }

        return (double) arg1 / arg2;
    }
}
