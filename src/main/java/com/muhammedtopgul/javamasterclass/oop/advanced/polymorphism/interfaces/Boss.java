package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces;

/**
 * @author muhammed-topgul created at 28/11/2021 18:04
 */

public class Boss extends Person implements Worker {

    public Boss() {
    }

    public Boss(int no, String name) {
        super(no, name);
    }

    public void youWorkToo() {
        System.out.println("Boss is working for you :)");
    }

    @Override
    public void work() {
        youWorkToo();
    }
}