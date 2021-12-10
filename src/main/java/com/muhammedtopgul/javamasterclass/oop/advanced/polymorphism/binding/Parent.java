package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.binding;

/**
 * @author muhammed-topgul 
 * @since 25.11.2021 14:35
 */

public class Parent {

    public static int a = 1;
    public int b = 2;

    public void publicMethod() {
        System.out.println("publicMethod in Parent.class");
    }

    private void privateMethod() {
        System.out.println("privateMethod in Parent.class");
    }

    public final void finalMethod() {
        System.out.println("finalMethod in Parent.class");
    }

    public static void staticMethod() {
        System.out.println("staticMethod in Parent.class");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod in Parent.class");
    }
}
