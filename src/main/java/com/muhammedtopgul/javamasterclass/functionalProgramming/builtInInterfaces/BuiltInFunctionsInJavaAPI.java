package com.muhammedtopgul.javamasterclass.functionalProgramming.builtInInterfaces;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * @author muhammed-topgul
 * @since 10.12.2021 14:47
 */

public class BuiltInFunctionsInJavaAPI {

    public static void main(String[] args) {
        List<String> technologies = new ArrayList<>();
        technologies.add("Java");
        technologies.add("Spring");
        technologies.add("Hibernate");
        technologies.add("JPA");
        technologies.add("JSF");

        printList(technologies);

        System.out.println("\nAfter Sorting Asc: ");
        Collections.sort(technologies);
        printList(technologies);

        System.out.println("\nAfter Add New Elements: ");
        technologies.add("Vaadin");
        technologies.add("Thymeleaf");
        printList(technologies);

        System.out.println("\nAfter Sorting With Comparator: ");
        Collections.sort(technologies, (var1, var2) -> var1.compareTo(var2));
        printList(technologies);

        System.out.println("\nAfter Sorting By Length: ");
        Collections.sort(technologies, (var1, var2) ->
                var1.length() - var2.length()
        );
        printList(technologies);

        System.out.println("\nAfter Remove: ");
        Predicate<String> predicate = (var) -> var.length() < 4;
        technologies.removeIf(predicate);
        printList(technologies);

        System.out.println("\nAfter Replace All: ");
        UnaryOperator<String> unaryOperator = (var) -> var.toUpperCase();
        technologies.replaceAll(unaryOperator);
        printList(technologies);
    }

    private static <T> void printList(List<T> list) {
        list.forEach(element -> {
            System.out.println(element);
        });
    }
}
