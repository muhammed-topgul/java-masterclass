package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.calculator.impl;

/**
 * @author muhammed-topgul created at 29/11/2021 11:07
 */

public class SquaredFunction extends AbstractMathFunction {

    public SquaredFunction() {
        super("Squared");
    }

    @Override
    public double calculate(double args) {
        return Math.sqrt(args);
    }
}
