package com.muhammedtopgul.javamasterclass.functionalProgramming.builtInInterfaces;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/**
 * @author muhammed-topgul
 * @since 09.12.2021 22:43
 */

public class BiFunctionExample {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> doubleConstructor = (var1, var2) -> new Double(var1 + "." + var2);
        System.out.println(doubleConstructor.apply(10, 2));

        BiFunction<Integer, Integer, Boolean> isGreaterThan = (var1, var2) -> var1 > var2;
        System.out.println(isGreaterThan.apply(12, 18));

        BiPredicate<Integer, Integer> isLessThan = (var1, var2) -> var1 < var2;
        System.out.println(isLessThan.test(4, 2));

        BiFunction<String, String, String> concat = (var1, var2) -> var1 + var2;
        System.out.println(concat.apply("Muhammed", "Topgul"));
    }
}
