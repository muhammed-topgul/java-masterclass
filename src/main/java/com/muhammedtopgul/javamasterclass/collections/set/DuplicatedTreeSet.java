package com.muhammedtopgul.javamasterclass.collections.set;

import com.muhammedtopgul.javamasterclass.collections.domain.Employee;
import com.muhammedtopgul.javamasterclass.collections.domain.EmployeeWithoutComparable;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author muhammed-topgul
 * @created at 14.12.2021 23:29
 */

public class DuplicatedTreeSet {

    public static void main(String[] args) {
       // stringSort();
       // comparableObjectSort();
        comparatorObjectSort();
    }

    public static void stringSort() {
        Set<String> set = new TreeSet<>();
        System.out.println(set.add("Java"));
        System.out.println(set.add("JavaScript"));
        System.out.println(set.add("C#"));
        System.out.println(set.add("Ada"));
        System.out.println(set.add("Ruby"));

        System.out.println("\n");

        set.forEach(System.out::println);
    }

    public static void comparableObjectSort() {
        Set<Employee> set = new TreeSet<>();

        Employee employee2 = new Employee(2, "Jack", "Doe");
        System.out.println(set.add(employee2));

        Employee employee1 = new Employee(1, "Muhammed", "Topgul");
        System.out.println(set.add(employee1));

        Employee employee3 = new Employee(3, "Jim", "Taylor");
        System.out.println(set.add(employee3));

        Employee employee4 = new Employee(1, "Muhammed", "Topgul");
        System.out.println(set.add(employee4));

        set.forEach(System.out::println);
    }

    public static void comparatorObjectSort() {
        Comparator<EmployeeWithoutComparable> compareByFirstName = Comparator.comparing(EmployeeWithoutComparable::getFirstName);
        Set<EmployeeWithoutComparable> set = new TreeSet<>(compareByFirstName);

        EmployeeWithoutComparable employee2 = new EmployeeWithoutComparable(2, "Jack", "Doe");
        System.out.println(set.add(employee2));

        EmployeeWithoutComparable employee1 = new EmployeeWithoutComparable(1, "Muhammed", "Topgul");
        System.out.println(set.add(employee1));

        EmployeeWithoutComparable employee3 = new EmployeeWithoutComparable(3, "Jim", "Taylor");
        System.out.println(set.add(employee3));

        EmployeeWithoutComparable employee4 = new EmployeeWithoutComparable(1, "Muhammed", "Topgul");
        System.out.println(set.add(employee4));

        set.forEach(System.out::println);
    }
}
