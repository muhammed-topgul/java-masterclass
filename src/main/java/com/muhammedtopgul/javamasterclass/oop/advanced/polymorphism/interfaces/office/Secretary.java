package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.office;

/**
 * @author muhammed-topgul
 * @since 28.11.2021 18:07
 */

public class Secretary extends Employee {

    protected Manager managerServed;

    public Secretary() {
    }

    public Secretary(int no, String name, int year, String department) {
        super(no, name, year, department);
    }

    public Secretary(int no, String name, int year, String department, Manager managerServed) {
        super(no, name, year, department);
        this.managerServed = managerServed;
    }

    public void serve() {
        System.out.println("Secretary " + name + " serves her manager: " + managerServed);
    }

    @Override
    public void work() {
        System.out.println("Secretary is working!");
        serve();
    }
}
