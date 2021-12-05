package com.muhammedtopgul.javamasterclass.oop.basic._super;

/**
 * @author muhammed-topgul 
 * @created at 18.11.2021 10:55
 */

public class Child extends Parent {

    protected int a = 2 * super.a; // Hiding a of parent
    protected boolean b; // Hiding b of parent
    protected String c;

    public Child(int a, boolean b, String c) {
        super(a, b);
        this.c = c;
    }

    protected static void g() {
        System.out.println("g() in Child");
    }

    @Override
    protected void printInfo() {
        System.out.println("a: " + a);
        System.out.println("super.a: " + super.a);
        System.out.println("b: " + b);
        System.out.println("super.b: " + super.b);
        System.out.println("c: " + c);
        g();
        super.g();
    }
}
