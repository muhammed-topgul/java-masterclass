package com.muhammedtopgul.javamasterclass.collections.abc;

import java.util.HashSet;
import java.util.Set;

/**
 * @author muhammed-topgul
 * @created at 14.12.2021 22:47
 */

public class Main {

    public static void main(String[] args) {
        Set<Name> set = new HashSet<>();
        set.add(new Name("A"));
        set.add(new Name("B"));
        set.add(new Name("B"));
        set.add(new Name("C"));

        set.forEach(System.out::println);
    }
}
