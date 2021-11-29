package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.calculator.service;

/**
 * @author muhammed-topgul created at 29/11/2021 11:08
 */

public interface Calculator {

    void addFunction(MathFunction mathFunction);

    void listMathFunction();

    double doCalculation(String functionName, double ags);
}
