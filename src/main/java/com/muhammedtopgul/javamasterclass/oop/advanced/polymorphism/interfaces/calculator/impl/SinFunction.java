package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.calculator.impl;

/**
 * @author muhammed-topgul created at 29/11/2021 11:05
 */

public class SinFunction extends AbstractMathFunction {

    public SinFunction() {
        super("Sin");
    }

    @Override
    public double calculate(double args) {
        return Math.sin(args);
    }
}
