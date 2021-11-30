package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.newFeatures.staticMethod;

/**
 * @author muhammed-topgul created at 30/11/2021 09:36
 */

public interface SubPrintable extends Printable {

    static void startPrinting() {
        System.out.println("Sub Printing is starting...");
    }
}
