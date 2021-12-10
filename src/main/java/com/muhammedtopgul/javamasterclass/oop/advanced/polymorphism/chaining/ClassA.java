package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.chaining;

/**
 * @author muhammed-topgul 
 * @since 28.11.2021 17:17
 */

public class ClassA extends AbstractB implements InterfaceA, InterfaceB, InterfaceC {



    @Override
    public void abstractA() {

    }

    @Override
    public void abstractB() {

    }

    @Override
    public void interfaceA() {
        super.interfaceA();
    }

    @Override
    public void interfaceB() {

    }

    @Override
    public void interfaceC() {

    }
}
