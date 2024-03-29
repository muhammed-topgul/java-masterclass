package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.newFeatures.defaultMethod;

/**
 * @author muhammed-topgul
 * @since 30.11.2021 00:10
 */

public class Main {

    public static void main(String[] args) {
        Printable pdf = new PDF();
        Printable word = new Word();

        word.view();
        word.print();
        word.format();

        System.out.println("\n");

        pdf.view();
        pdf.print();
        pdf.format(); // throws exception
    }
}
