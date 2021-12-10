package com.muhammedtopgul.javamasterclass.functionalProgramming.builtInInterfaces.composition;

import java.util.Scanner;
import java.util.function.Function;

/**
 * @author muhammed-topgul
 * @since 10.12.2021 15:05
 */

public class FunctionComposition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = scanner.nextInt();

        Function<Integer, Integer> twice = (number) -> number * 2;
        Function<Integer, Integer> square = (number) -> number * number;

        int outcome = twice.apply(i);
        outcome = square.apply(outcome);
        System.out.println("Result: " + outcome);

        outcome = square.apply(i);
        outcome = twice.apply(outcome);
        System.out.println("Result: " + outcome);

        System.out.println();

        Function<Integer, Integer> twiceAndThenSquare = twice.andThen(square);
        outcome = twiceAndThenSquare.apply(i);
        System.out.println("Result: " + outcome);

        Function<Integer, Integer> twiceComposeSquare = twice.compose(square);
        outcome = twiceComposeSquare.apply(i);
        System.out.println("Result: " + outcome);
    }
}
