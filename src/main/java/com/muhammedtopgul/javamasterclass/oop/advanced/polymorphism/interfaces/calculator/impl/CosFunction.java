package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.calculator.impl;

/**
 * @author muhammed-topgul 
 * @since 29.11.2021 11:07
 */

public class CosFunction extends AbstractMathFunction {

    public CosFunction() {
        // super("Cos");
        this.name = "Cos";
    }

    @Override
    public double calculate(double args) {
        return Math.cos(args);
    }
}
