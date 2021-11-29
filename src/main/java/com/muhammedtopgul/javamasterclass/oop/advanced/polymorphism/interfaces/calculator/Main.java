package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.calculator;

import com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.calculator.impl.*;

import java.util.Scanner;

/**
 * @author muhammed-topgul created at 29/11/2021 11:14
 */

public class Main {

    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);

        CalculatorT1 calculator1 = new CalculatorT1(5);
        calculator1.addFunction(new CosFunction());
        calculator1.addFunction(new FactorialFunction());
        calculator1.addFunction(new LogFunction());
        calculator1.addFunction(new SinFunction());
        calculator1.addFunction(new SquaredFunction());

        startCalculator(calculator1);
    }

    private static void startCalculator(CalculatorT1 calculator) {
        calculator.listMathFunction();

        System.out.print("Please enter the name of the function: ");
        String functionName = in.next();
        if (functionName.equalsIgnoreCase("end"))
            System.exit(0);
        System.out.print("Please enter the argument of the function: ");
        double functionArg = in.nextDouble();
        double result = calculator.doCalculation(functionName, functionArg);
        System.out.println(functionName + " of " + functionArg + " is " + result + "\n");

        startCalculator(calculator);
    }
}
