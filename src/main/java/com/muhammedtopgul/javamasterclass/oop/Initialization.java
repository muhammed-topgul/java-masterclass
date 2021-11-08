package com.muhammedtopgul.javamasterclass.oop;

/**
 * @author muhammed-topgul created at 08/11/2021 23:02
 */

public class Initialization {

    int a, b, d;
    static int c;

    {
        System.out.println("inside of { }");
        a = 1;
        b = 2;
        c = 3;
    }

    static {
        System.out.println("inside of static { }");
        c = 100;
    }

    public Initialization() {
        System.out.println("inside of constructor");
        a = -88;
        b = -44;
        c = -22;
    }

    public static void main(String[] args) {
        Initialization initialization = new Initialization();
        System.out.println(initialization.a);
        System.out.println(initialization.b);
        System.out.println(Initialization.c);
        System.out.println(initialization.d);
    }
}
