package com.muhammedtopgul.javamasterclass.collections.interfaces;

import com.muhammedtopgul.javamasterclass.collections.util.CollectionUtil;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author muhammed-topgul
 * @created at 13.12.2021 23:29
 */

public class IteratorExample {

    public static void main(String[] args) {
        Collection collection = CollectionUtil.getCollection();
        System.out.println("Collection: " + collection);
        collection.add("hundred");
        System.out.println(collection.contains("threes"));

        Iterator iterator = collection.iterator();
        // collection.add("thousand"); throws ConcurrentModificationException
        // collection.remove("four"); throws ConcurrentModificationException
        System.out.println("\nIterating...");

        while (iterator.hasNext()) {
            Object object = iterator.next();
            String string = (String) object;
            System.out.println(string);
            if (string.startsWith("o")) {
                iterator.remove();
            }
        }
        collection.add("thousand");
        collection.remove("three");

        System.out.println("\nCollection after iterator: " + collection);
    }
}
