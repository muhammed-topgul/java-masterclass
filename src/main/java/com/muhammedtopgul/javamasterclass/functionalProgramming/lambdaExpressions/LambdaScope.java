package com.muhammedtopgul.javamasterclass.functionalProgramming.lambdaExpressions;

/**
 * @author muhammed-topgul
 * @since 09.12.2021 20:39
 */

public class LambdaScope {

    private int i = 3;
    private String s = "Instance variable";
    private static boolean b = false;

    public static void main(String[] args) {
        int var1 = 5;
        String var2 = "In main()";

        LambdaScope lambdaScope = new LambdaScope();

        // var2 = "MAMA";
        lambdaScope.i = 58;

        ScopeInterface scopeInterface = (aa, bb) -> {
            int m = 10;
            aa = aa + 5;
            aa = var1;

            bb = var2;
            // var2 = "Muhammed"; will not compile
            // lambdaScope = new LambdaScope(); will not compile

            aa = lambdaScope.i;

            lambdaScope.i = 5;
        };

        System.out.println(scopeInterface.m);
        scopeInterface.printer();
        ScopeInterface.info();
    }
}

@FunctionalInterface
interface ScopeInterface {
    int m = 1; // public static final

    void method(int var1, String var2);

    default void printer() {
        System.out.println("Default method()");
    }

    static void info() {
        System.out.println("Static Method()");
    }
}
