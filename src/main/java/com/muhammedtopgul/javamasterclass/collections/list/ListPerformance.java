package com.muhammedtopgul.javamasterclass.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author muhammed-topgul
 * @since 15.12.2021 14:19
 */

public class ListPerformance {

    private static final int n = 100_000;

    public static void main(String[] args) {
        arrayListPerformance();
        linkedListPerformance();
    }

    public static void arrayListPerformance() {
        List<Integer> list = new ArrayList<>();
        double start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            // list.add(i);
            list.add(0, i);
        }
        double end = System.currentTimeMillis();
        System.out.println("ArrayList: " + (end - start));
    }

    public static void linkedListPerformance() {
        List<Integer> list = new LinkedList<>();
        double start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            // list.add(i);
            list.add(0, i);
        }
        double end = System.currentTimeMillis();
        System.out.println("LinkedList: " + (end - start));
    }
}
