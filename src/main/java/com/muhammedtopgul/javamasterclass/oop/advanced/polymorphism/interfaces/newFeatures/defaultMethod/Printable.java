package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.newFeatures.defaultMethod;

/**
 * @author muhammed-topgul 
 * @since 30.11.2021 00:05
 */

public interface Printable {

    void view();

    void print();

    default void format() {
        System.out.println("format() must be implement.");
        throw new UnsupportedOperationException("Format function did not override.");
    }
}
