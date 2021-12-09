package com.muhammedtopgul.javamasterclass.functionalProgramming.builtInInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author muhammed-topgul
 * @created at 09.12.2021 22:13
 */

public class FunctionExample {

    public static void main(String[] args) {
        Function<Integer, String> converter = (number) -> Integer.toString(number);
        System.out.println(converter.apply(1726).length());

        Function<Integer, Integer> square = (number) -> number * number;
        System.out.println(square.apply(2));

        Function<Integer, Double> squareRoot = (number) -> Math.sqrt(number);
        System.out.println(squareRoot.apply(3));

        Function<Integer, Boolean> isEven = (number) -> number % 2 == 0;
        System.out.println(isEven.apply(2));
        System.out.println(isEven.apply(3));

        Predicate<Integer> isEvenPredicate = (number) -> number % 2 == 0;
        System.out.println(isEvenPredicate.test(5));

        Function<List<String>, Integer> listSize = (list) -> list.size();
        System.out.println(listSize.apply(Arrays.asList("Java", "Spring", "Hibernate")));

        Function<List<String>, Integer[]> stringLength = (list) -> {
            int size = list.size();
            Integer[] integer = new Integer[size];
            for (int i = 0; i < size; i++) {
                integer[i] = list.get(i).length();
            }
            return integer;
        };
        System.out.println(Arrays.toString(stringLength.apply(Arrays.asList("Java", "Spring", "Hibernate"))));
    }
}

