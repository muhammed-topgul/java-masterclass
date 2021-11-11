package com.muhammedtopgul.javamasterclass.oop;

import java.util.Random;

/**
 * @author muhammed-topgul created at 08/11/2021 23:02
 */

public class Initialization {

    public static final String name = "Muhammed";

    int a, b, d;
    static int c, e;

    {
        System.out.println("inside of { }");
        System.out.println(name);
        this.a = 1;
        b = 2;
        c = 3;
    }

    static {
        System.out.println("inside of static { }");
        System.out.println(name);
        c = new Random().nextInt();
    }

    public Initialization() {
        System.out.println("inside of constructor");
        a = -88;
        b = -44;
        c = -22;
    }
}

class Main {
    public static void main(String[] args) {
//        Initialization initialization = new Initialization();
//        System.out.println(initialization.a);
//        System.out.println(initialization.b);
//        System.out.println(Initialization.c);
//        System.out.println(initialization.d);
//        System.out.println(Initialization.c);
//        Initialization initialization;

        System.out.println(Initialization.name);
        System.out.println(Initialization.c);
        System.out.println(Initialization.e);

        System.out.println("******************************");

        Initialization i = new Initialization();
        System.out.println(Initialization.c);
    }
}
