package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.calculator.impl;

/**
 * @author muhammed-topgul 
 * @since 29.11.2021 11:10
 */

public class FactorialFunction extends AbstractMathFunction {

    public FactorialFunction() {
        super("Fact");
    }

    @Override
    public double calculate(double arg) {
        return calculateFactorial(arg);
    }

    private int calculateFactorial(double arg) {
        int k = (int) arg;
        int factorial = 1;

        for (int i = 2; i <= k; i++) {
            factorial *= i;

        }
        return factorial;
    }
}
