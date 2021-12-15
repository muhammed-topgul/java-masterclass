package com.muhammedtopgul.javamasterclass.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * @author muhammed-topgul
 * @since 15.12.2021 16:04
 */

public class MapExample {

    public static void main(String[] args) {
        // fundamentals();
        mapFunctions();
    }

    public static void fundamentals() {
        Map<Integer, String> map = new HashMap<>();

        System.out.println(map.put(1, "A"));
        System.out.println(map.put(2, "B"));
        System.out.println(map.put(3, "C"));
        System.out.println(map.put(4, "D"));
        System.out.println(map.put(1, "A"));

        System.out.println(map.putIfAbsent(1, "E"));
        System.out.println(map.putIfAbsent(5, "E"));

        System.out.println("\nMap: ");
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        System.out.println("\nKeys: ");
        map.keySet().forEach(System.out::println);

        System.out.println("\nValues: ");
        map.values().forEach(System.out::println);

        System.out.println("\nContains Key: ");
        System.out.println(map.containsKey(1));

        System.out.println("\nContains Value: ");
        System.out.println(map.containsValue("E"));

        System.out.println("\nMap Entry: ");
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry);
        }

        System.out.println("\nIterator: ");
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(map.get(iterator.next()));
        }
    }

    public static void mapFunctions() {
        Map<Integer, String> map = new HashMap<>();

        System.out.println(map.put(1, "A"));
        System.out.println(map.put(2, "B"));
        System.out.println(map.put(3, "C"));
        System.out.println(map.put(4, "D"));
        System.out.println(map.put(1, "A"));

        BiFunction<String, String, String> merge = (var0, var1) -> var0 + var1;
        map.merge(3, "001", merge);

        System.out.println("\nMap: ");
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
