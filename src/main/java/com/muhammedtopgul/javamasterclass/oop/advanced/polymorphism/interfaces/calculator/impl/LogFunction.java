package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.calculator.impl;

/**
 * @author muhammed-topgul 
 * @created at 29.11.2021 11:06
 */

public class LogFunction extends AbstractMathFunction {

    public LogFunction() {
        super("Log");
    }

    @Override
    public double calculate(double args) {
        return Math.log(args);
    }
}
