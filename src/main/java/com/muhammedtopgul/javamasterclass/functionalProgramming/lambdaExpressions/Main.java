package com.muhammedtopgul.javamasterclass.functionalProgramming.lambdaExpressions;

/**
 * @author muhammed-topgul
 * @created at 08.12.2021 22:47
 */

public class Main {
    Math mode = (double arg1, double arg2) -> arg1 % arg2;
    public static final Math pow = (double arg1, double arg2) -> java.lang.Math.pow(arg1, arg2);

    public static void main(String[] args) {
        Main main = new Main();

        main.withoutLambda();

        main.withLambda();

        main.doMath(pow, 3, 5);
    }

    public void withoutLambda() {
        Math sum = new Math() {
            @Override
            public double calculate(double arg1, double arg2) {
                return arg1 + arg2;
            }
        };

        doMath(sum, 3, 5);
    }

    public void withLambda() {
        Math math = (double arg1, double arg2) -> {
            return arg1 + arg2;
        };
        doMath(math, 3, 5);

        doMath((double arg1, double arg2) -> {
            return arg1 - arg2;
        }, 3, 5);

        doMath((double arg1, double arg2) -> arg1 * arg2, 3, 5);

        doMath(mode, 3, 5);
    }

    public void doMath(Math math, double arg1, double arg2) {
        System.out.println(math.calculate(arg1, arg2));
    }
}
