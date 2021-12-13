package com.muhammedtopgul.javamasterclass.collections.interfaces;

import com.muhammedtopgul.javamasterclass.collections.util.CollectionUtil;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author muhammed-topgul
 * @created at 13.12.2021 23:42
 */

public class IterableExample {

    public static void main(String[] args) {
        Collection collection = CollectionUtil.getCollection();
        System.out.println("Collection: " + collection);

        iterable(collection);
        forEach(collection);
    }

    public static void iterable(Iterable<String> iterable) {
        System.out.println("\n*** iterable() ***");
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            String string = (String) iterator.next();
            System.out.println(string + " has " + string.length() + " size.");
        }
    }

    public static void forEach(Iterable<String> iterable) {
        System.out.println("\n*** forEach() ***");
        iterable.forEach(string ->   System.out.println(string + " has " + string.length() + " size."));
    }
}
