package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.abstractClasses;

/**
 * @author muhammed-topgul 
 * @since 28.11.2021 15:28
 */

public abstract class Person {

    public abstract void speakAbstract();

    public void speakConcrete() {
        System.out.println("Person is speaking...");
    }

    public static void main(String[] args) {
        System.out.println("Java");
    }
}
