package com.muhammedtopgul.javamasterclass.exceptions.assertions;

/**
 * @author muhammed-topgul created at 05/12/2021 21:56
 */

public class SqrtCalculator {

    public static void main(String[] args) {
        int var = 9;
        SqrtCalculator sqrtCalculator = new SqrtCalculator();

        // System.out.println(sqrtCalculator.sqrtWithExceptions(var));
        System.out.println(sqrtCalculator.sqrtWithAssertions(var));
    }

    public double sqrtWithExceptions(int var) {
        if (var < 0)
            throw new IllegalArgumentException("Cannot pass negative: " + var);
        return Math.sqrt(var);
    }

    public double sqrtWithAssertions(int var) {
        assert var > 0 : "Cannot pass negative: " + var;
        return Math.sqrt(var);
    }
}
