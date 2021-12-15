package com.muhammedtopgul.javamasterclass.collections.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author muhammed-topgul
 * @since 15.12.2021 14:33
 */

public class VectorExample {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("C#");
        vector.add("Ruby");
        vector.add("Python");
        vector.add("Java");

        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        System.out.println();
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        System.out.println();
        for (String s : vector) {
            System.out.println(s);
        }

        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
    }
}
