package com.muhammedtopgul.javamasterclass.exceptions.customException;

/**
 * @author muhammed-topgul 
 * @created at 05.12.2021 20:24
 */

public class NegativeArgumentException extends Exception {

    private double argument;

    public NegativeArgumentException(String message) {
        super(message);
    }

    public NegativeArgumentException(String message, double argument) {
        super(message + " " + argument);
        this.argument = argument;
    }

    public double getArgument() {
        return argument;
    }
}
