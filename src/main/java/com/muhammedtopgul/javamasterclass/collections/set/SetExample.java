package com.muhammedtopgul.javamasterclass.collections.set;

import java.util.*;

/**
 * @author muhammed-topgul
 * @created at 14.12.2021 21:43
 */

public class SetExample {

    public static void main(String[] args) {
        // fundamentals();
        // add();
        addAll();
    }

    public static void fundamentals() {
        List<String> list = new ArrayList<>();
        list.add("C#");
        list.add("C++");
        list.add("C#");

        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("JavaScript");
        set.add("Java");
        set.add(null);
        set.add(null);
        set.addAll(list);

        System.out.println("Size: " + set.size());

        System.out.println("\nIterator: ");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nforEach: ");
        set.forEach(element -> System.out.println(element));

        System.out.println("\n.of: ");
        set = Set.of("Hibernate", "Spring", "Java EE");
        // set = Set.of("Hibernate", "Spring", "Java EE", null); // throws NullPointerException
        // set.add("Tomcat"); throws UnsupportedOperationException
        // set.remove("C#"); throws UnsupportedOperationException
        set.forEach(System.out::println);
    }

    public static void add() {
        Set set1 = new HashSet<>();
        Set set2 = new HashSet<>();

        set1.add("Java");
        set1.add("JavaScript");
        set1.add("C#");

        set2.add("Java");
        set2.add("Ruby");
        set2.add("C++");
        set1.add(set2);

        set1.forEach(System.out::println);
    }

    public static void addAll() {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("Java");
        set1.add("JavaScript");
        set1.add("C#");

        set2.add("Java");
        set2.add("Ruby");
        set2.add("C++");
        set1.addAll(set2);

        set1.forEach(System.out::println);
    }
}
