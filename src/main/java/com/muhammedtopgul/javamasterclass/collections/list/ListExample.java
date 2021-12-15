package com.muhammedtopgul.javamasterclass.collections.list;

import java.util.*;

/**
 * @author muhammed-topgul
 * @since 15.12.2021 13:09
 */

public class ListExample {

    public static void main(String[] args) {
        // fundamentals();
        asList();
        // iteratorAndListIterator();
    }

    public static List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C#");
        list.add("JavaScript");
        list.add("Java");
        list.add("Ruby");
        list.add("Java");
        return list;
    }

    public static void fundamentals() {
        List<String> list = getList();

        printList(list);

        System.out.println("\nindexOf(): " + list.indexOf("Java"));
        System.out.println("lastIndexOf(): " + list.lastIndexOf("Java"));
        System.out.println("get(): " + list.get(3));
        System.out.println("set(): " + list.set(2, "C++"));
        printList(list);

        System.out.println("\nremove(): " + list.remove(2));
        printList(list);

        list = list.subList(2, 4);
        list.add(1, "Python");
        printList(list);

        Collections.reverse(list);
        printList(list);

        Collections.sort(list);
        printList(list);

        List<String> copyList = List.copyOf(list);
        // copyList.add("C"); throws Exception
        // copyList.add(null); throws Exception
        printList(copyList);

        copyList = new ArrayList<>(copyList);
        copyList.add("Lisp");
        printList(copyList);
    }

    public static void asList() {
        String[] strings = {"Java", "Ruby", "C", "Lisp"};
        List<String> list = Arrays.asList(strings);
        // list.add("C#"); throws Exception
        list.set(1, "Ada");

        printList(list);

        System.out.println();
        for (String string : strings) {
            System.out.println(string);
        }

    }

    public static void iteratorAndListIterator() {
        // iterator
        List<String> list = getList();

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // System.out.println(iterator.next()); throws Exception
        iterator.remove();
        printList(list);

        System.out.println("\n");

        // list iterator
        ListIterator<String> listIterator = list.listIterator();
        // list.add("Spring");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println(listIterator.previousIndex());
        System.out.println(listIterator.previous());

        System.out.println("\n");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }

    public static void printList(List<String> list) {
        System.out.println("\n");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
