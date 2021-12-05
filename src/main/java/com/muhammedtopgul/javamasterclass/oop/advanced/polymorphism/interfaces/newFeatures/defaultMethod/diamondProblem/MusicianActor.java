package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.newFeatures.defaultMethod.diamondProblem;

/**
 * @author muhammed-topgul 
 * @created at 30.11.2021 00:41
 */

public class MusicianActor implements Actor, Musician {

    // must be override
    @Override
    public void play() {
        Actor.super.play();
        System.out.println("Musician Actor is playing...");
    }
}
