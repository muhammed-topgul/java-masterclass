package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.binding;

/**
 * @author muhammed-topgul created at 25/11/2021 14:39
 */

public class Child2 extends Parent {

    public static int a = 5;
    public int b = 2;

    public void publicMethod() {
        System.out.println("publicMethod in Child2.class");
    }

    // @Override
    private void privateMethod() {
        System.out.println("privateMethod in Child2.class");
    }

//    public final void finalMethod() {
//        System.out.println("finalMethod in Child2.class");
//    }

    // @Override
    public static void staticMethod() {
        System.out.println("staticMethod in Child2.class");
    }

    @Override
    protected void protectedMethod() {
        System.out.println("protectedMethod in Child2.class");
    }
}
