package com.muhammedtopgul.javamasterclass.functionalProgramming.exception;

/**
 * @author muhammed-topgul
 * @since 09.12.2021 21:18
 */

public class Main {

    public static void main(String[] args) {
        ExceptionThrowing exceptionThrowing = (var1, var2) -> {

            if (var1 < 0 && var2 < 0)
                throw new AllNegativeArgumentException("All arguments must be positive");

            if (var1 < 0 || var2 < 0)
                if (var1 < 0)
                    throw new AllNegativeArgumentException("First argument must be positive");
                else
                    throw new AllNegativeArgumentException("Second argument must be positive");

            return var1 + var2;
        };

        math(exceptionThrowing, -3, -5);
    }

    public static void math(ExceptionThrowing exceptionThrowing, int var1, int var2) {
        try {
            System.out.println(exceptionThrowing.method(var1, var2));
        } catch (NegativeArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

@FunctionalInterface
interface ExceptionThrowing {

    int method(int var1, int var2) throws NegativeArgumentException;
}

class NegativeArgumentException extends Exception {

    public NegativeArgumentException(String message) {
        super(message);
    }
}

class AllNegativeArgumentException extends NegativeArgumentException {

    public AllNegativeArgumentException(String message) {
        super(message);
    }
}
