package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.newFeatures.defaultMethod.diamondProblem;

/**
 * @author muhammed-topgul 
 * @since 30.11.2021 00:40
 */

public interface Actor extends Artist {

    @Override
    default void play() {
        System.out.println("Actor is playing...");
    };
}
