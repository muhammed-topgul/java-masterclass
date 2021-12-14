package com.muhammedtopgul.javamasterclass.collections.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author muhammed-topgul
 * @created at 14.12.2021 21:53
 */

public class DuplicatedNumber {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();

        do {
            int number = random.nextInt(10) + 1;
            if (!set.add(number)) {
                System.err.println("Duplicate number detected: " + number);
            }
        } while (set.size() != 8);

        set.forEach(System.out::println);
    }
}
