package com.muhammedtopgul.javamasterclass.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author muhammed-topgul
 * @created at 14.12.2021 22:35
 */

public class HashSetExample {

    public static void main(String[] args) {
        fundamentals();
    }

    public static void fundamentals() {
        Set<String> set = new HashSet<>();
        set = new HashSet<>(new ArrayList<>());
        set = new HashSet<>(4); // default initial capacity 16
        set = new HashSet<>(4, 0.9f); // default loadFactor 0.75

        set.add("Java");
        set.add("C#");
        set.add("JavaScript");
        set.add("Ruby");
        set.add("Python");

        set.forEach(System.out::println);
    }
}
