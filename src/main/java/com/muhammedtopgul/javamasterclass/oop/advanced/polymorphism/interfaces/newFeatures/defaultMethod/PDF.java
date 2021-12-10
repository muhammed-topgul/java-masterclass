package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.newFeatures.defaultMethod;

/**
 * @author muhammed-topgul
 * @since 30.11.2021 00:07
 */

public class PDF implements Printable {

    @Override
    public void view() {
        System.out.println("PDF file viewed.");
    }

    @Override
    public void print() {
        System.out.println("PDF file printed.");
    }
}
