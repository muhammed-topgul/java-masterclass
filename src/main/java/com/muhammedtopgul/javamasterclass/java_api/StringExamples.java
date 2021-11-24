package com.muhammedtopgul.javamasterclass.java_api;

/**
 * @author muhammed-topgul created at 21/11/2021 20:02
 */

public class StringExamples {

    public static void main(String[] args) {
        String a = new String("Java");
        String b = new String("Java");

        System.out.println(a.equals(b));
        System.out.println(a == b);

        System.out.println("\n************************\n");

        String c = "Java";
        String d = "Java";

        System.out.println(c.equals(d));
        System.out.println(c == d);

        System.out.println("\n************************\n");

        System.out.println(a.equals(c));
        System.out.println(a == c);

        System.out.println("\n************************\n");

        String name = "Muhammed";
        name = name.concat(" Topgul");

        System.out.println(name);
    }
}
