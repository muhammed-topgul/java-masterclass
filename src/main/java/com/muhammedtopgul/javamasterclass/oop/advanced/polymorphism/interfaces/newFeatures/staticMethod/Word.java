package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.newFeatures.staticMethod;

/**
 * @author muhammed-topgul
 * @since 30.11.2021 00:08
 */

public class Word implements SubPrintable {

    @Override
    public void view() {
        System.out.println("Word file viewed.");
    }

    @Override
    public void print() {
        System.out.println("Word file printed.");
    }

    @Override
    public void format() {
        // Printable.super.format();
        System.out.println("Word file formatted.");
    }
}
