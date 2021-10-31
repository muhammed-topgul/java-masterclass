package com.muhammedtopgul.javamasterclass.operators;

/**
 * @author muhammed-topgul created at 31/10/2021 18:59
 */

public class EqualityOperators {

    public static void main(String[] args) {
        String s1 = new String("I love Java");
        String s2 = new String("I love Java");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = "I love Java";
        String s4 = "I love Java";

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }
}
