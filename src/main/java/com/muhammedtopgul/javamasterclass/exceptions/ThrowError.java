package com.muhammedtopgul.javamasterclass.exceptions;

/**
 * @author muhammed-topgul created at 01/12/2021 17:13
 */

public class ThrowError {


    public static void main(String[] args) {
        // throwError1();
		throwError2();
        recursiveMethod();
    }

    public static void throwError1() {
        System.out.println("I'll throw an error now!");
        throw new OutOfMemoryError("Just kidding!");
    }

    public static void throwError2() {
        System.out.println("I'll throw an error now!");
        try {
            throw new OutOfMemoryError("Just kidding!");
        } catch (OutOfMemoryError e) {
            System.out.println(e.getMessage());
        }
    }

    public static void recursiveMethod() {
        recursiveMethod();
    }
}
