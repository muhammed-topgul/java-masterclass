package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.newFeatures.defaultMethod.diamondProblem;

/**
 * @author muhammed-topgul created at 30/11/2021 00:41
 */

public interface Musician extends Artist {

    @Override
    default void play() {
        System.out.println("Musician is playing...");
    }
}
