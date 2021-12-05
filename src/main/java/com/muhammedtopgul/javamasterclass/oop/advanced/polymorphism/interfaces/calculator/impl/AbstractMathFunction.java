package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.calculator.impl;

import com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.calculator.service.MathFunction;

/**
 * @author muhammed-topgul
 * @created at 29.11.2021 16:17
 */

public abstract class AbstractMathFunction implements MathFunction {

    protected String name;

    public AbstractMathFunction() {
    }

    public AbstractMathFunction(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
