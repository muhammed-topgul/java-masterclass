package com.muhammedtopgul.javamasterclass.types_and_variables.constant;

/**
 * @author muhammed-topgul created at 27/10/2021 22:23
 */

public class Final {
    // final String _final; // will not compile

    public static void main(String[] args) {
        final String _final1 = "final 1";
        // _final1 = "updated"; // will not compile

        final String _final2; // will compile
        _final2 = "final 2";
        // _final2 = "updated"; // will not compile

        // final variable vs constant variable
        final int constantVariable = 5;
        final int finalVariable;

        if (true) {
            finalVariable = 15;
        } else {
            finalVariable = -15;
        }

        System.out.println(constantVariable);
        System.out.println(finalVariable);
    }
}
