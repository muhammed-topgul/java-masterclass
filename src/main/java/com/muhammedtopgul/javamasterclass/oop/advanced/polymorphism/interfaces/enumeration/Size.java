package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.enumeration;

/**
 * @author muhammed-topgul created at 29/11/2021 17:14
 */

public enum Size implements AnInterface {

    SMALL, MEDIUM, LARGE;

    @Override
    public int getLine(String arg) {
        for (Size value : values()) {
            if (value.name().equals(arg)) {
                return value.ordinal();
            }
        }
        return -1;
    }
}
