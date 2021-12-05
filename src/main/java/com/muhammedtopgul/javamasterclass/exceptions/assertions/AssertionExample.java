package com.muhammedtopgul.javamasterclass.exceptions.assertions;

/**
 * @author muhammed-topgul
 * @created at 05.12.2021 21:41
 */

public class AssertionExample {

    public static void main(String[] args) {
        int i = 12;

        assert i > 3;

        assert i > 16 : "Custom Assertion Error message!!!";
    }
}
