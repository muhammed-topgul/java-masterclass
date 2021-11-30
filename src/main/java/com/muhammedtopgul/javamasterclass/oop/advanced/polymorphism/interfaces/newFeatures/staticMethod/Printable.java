package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.newFeatures.staticMethod;

/**
 * @author muhammed-topgul created at 30/11/2021 00:05
 */

public interface Printable {

    void view();

    void print();

    default void format() {
        System.out.println("format() must be implement.");
        throw new UnsupportedOperationException("Format function did not override.");
    }

    static void startPrinting() {
        System.out.println("Printing is starting...");
    }
}
