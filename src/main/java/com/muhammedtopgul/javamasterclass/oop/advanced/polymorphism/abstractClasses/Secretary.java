package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.abstractClasses;

/**
 * @author muhammed-topgul 
 * @created at 28.11.2021 14:18
 */

public class Secretary extends Employee {

    protected Manager managerServed;

    public Secretary() {
    }

    public Secretary(int no, String name, int year, String department, Manager managerServed) {
        super(no, name, year, department);
    }

    public void serve(){
        System.out.println("Secretary " + name + " serves her manager: " + managerServed);
    }

    @Override
    public void work() {
        System.out.println("Secretary is working!");
        serve();
    }

    @Override
    public void speakConcrete() {
        System.out.println("Secretary is speaking...");
    }
}
