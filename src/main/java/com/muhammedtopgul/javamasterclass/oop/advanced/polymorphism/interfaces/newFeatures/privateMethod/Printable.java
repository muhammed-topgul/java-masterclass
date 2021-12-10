package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.newFeatures.privateMethod;

/**
 * @author muhammed-topgul
 * @since 30.11.2021 00:05
 */

public interface Printable {

    void view();

    void print();

    default void format() {
        staticInfo("***static private*** format() must be implement.");
        info("***private*** format() must be implement.");
        throw new UnsupportedOperationException("Format function did not override.");
    }

    static void startPrinting() {
        staticInfo("***static private*** Printing is starting...");
    }

    private static void staticInfo(String info) {
        System.out.println(info);
    }

    private void info(String info) {
        System.out.println(info);
    }
}
