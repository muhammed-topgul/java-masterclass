package com.muhammedtopgul.javamasterclass.oop.basic._super;

/**
 * @author muhammed-topgul 
 * @since 18.11.2021 10:53
 */

public class Parent {

    protected int a;
    protected boolean b;
    protected static String c = "11";

    public Parent(int a, boolean b) {
        this.a = a;
        this.b = b;
    }

    protected static void g() {
        System.out.println("g() in Parent");
    }

    protected void printInfo() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        g();
    }
}
