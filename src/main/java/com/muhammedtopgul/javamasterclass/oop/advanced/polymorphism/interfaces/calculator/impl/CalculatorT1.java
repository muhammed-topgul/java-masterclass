package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.calculator.impl;

import com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.calculator.service.Calculator;
import com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.calculator.service.MathFunction;

/**
 * @author muhammed-topgul 
 * @since 29.11.2021 11:12
 */

public class CalculatorT1 implements Calculator {

    private int currentCount = 0;

    private MathFunction[] functions;

    public CalculatorT1(int functionCount) {
        functions = new MathFunction[functionCount];
    }

    @Override
    public void addFunction(MathFunction function) {
        functions[currentCount] = function;
        currentCount++;
    }

    @Override
    public double doCalculation(String functionName, double arg) {
        double result = 0.0;
        boolean isFunctionFound = false;
        for (MathFunction function : functions) {
            if (functionName.equalsIgnoreCase(function.getName())) {
                result = function.calculate(arg);
                isFunctionFound = true;
            }
        }
        if (!isFunctionFound)
            System.out.println("No such function found!");

        return result;
    }

    @Override
    public void listMathFunction() {
        System.out.println("Available Functions:");
        for (MathFunction function : functions)
            System.out.println(function.getName());
    }
}
