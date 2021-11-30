package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.newFeatures.staticMethod;

/**
 * @author muhammed-topgul created at 30/11/2021 00:10
 */

public class Main {

    public static void main(String[] args) {
        Printable pdf = new PDF();
        SubPrintable word = new Word();

        Printable.startPrinting();
        SubPrintable.startPrinting();

        System.out.println("\n");

        word.view();
        word.print();
        word.format();

        System.out.println("\n");

        pdf.view();
        pdf.print();
        pdf.format(); // throws exception
    }
}
