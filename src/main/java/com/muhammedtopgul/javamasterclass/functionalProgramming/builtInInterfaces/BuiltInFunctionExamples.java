package com.muhammedtopgul.javamasterclass.functionalProgramming.builtInInterfaces;

import java.util.Date;
import java.util.function.*;

/**
 * @author muhammed-topgul
 * @created at 09.12.2021 22:55
 */

public class BuiltInFunctionExamples {

    public static void main(String[] args) {
        // Consumer
        Consumer<String> toLowerCase = (string) -> System.out.println(string.toLowerCase());
        toLowerCase.accept("JAVA SE");

        IntConsumer intConsumer = (number) -> System.out.println(number);
        intConsumer.accept(58);

        // BiConsumer
        BiConsumer<String, String> concat = (var1, var2) -> System.out.println(var1 + var2);
        concat.accept("Muhammed", "Topgul");

        // Supplier
        Supplier<String> string = () -> "Java is great";
        System.out.println(string.get());

        Supplier<Date> date = () -> new Date();
        System.out.println(date.get());

        // Predicate
        Predicate<String> stringLength = (var1) -> var1.length() > 10;
        System.out.println(stringLength.test("Muhammed"));

        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        System.out.println(isEven.test(10));

        Predicate<Integer> isPositive = (number) -> number > 0;
        System.out.println(isPositive.test(-5));

        Predicate<Integer> isEvenAndPositive = isEven.and(isPositive);
        System.out.println(isEvenAndPositive.test(11));

        Predicate<Integer> isEvenOrPositive = isEven.or(isPositive);
        System.out.println(isEvenOrPositive.test(1));

        Predicate<Integer> isEventNot = Predicate.not(isEven);
        System.out.println(isEventNot.test(11));
    }
}
