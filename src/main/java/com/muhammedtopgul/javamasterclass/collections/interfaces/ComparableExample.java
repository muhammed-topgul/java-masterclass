package com.muhammedtopgul.javamasterclass.collections.interfaces;

import com.muhammedtopgul.javamasterclass.collections.domain.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author muhammed-topgul
 * @since 14.12.2021 16:26
 */

public class ComparableExample {

    public static void main(String[] args) {
        Integer i1 = 12;
        Integer i2 = 9;
        System.out.println("Compare 12 to 9: " + i1.compareTo(i2));
        System.out.println("Compare 9 to 12: " + i2.compareTo(i1));
        System.out.println("Compare 9 to 9: " + i2.compareTo(i2));

        Character c1 = 'A';
        Character c2 = 'B';
        System.out.println("\nCompare A to B: " + c1.compareTo(c2));
        System.out.println("Compare B to A: " + c2.compareTo(c1));
        System.out.println("Compare A to A: " + c1.compareTo(c1));

        Boolean b1 = true;
        Boolean b2 = false;
        System.out.println("\nCompare true to false: " + b1.compareTo(b2));
        System.out.println("Compare false to true: " + b2.compareTo(b1));

        Employee employee1 = new Employee(1, "Muhammed", "Topgul");
        Employee employee2 = new Employee(2, "John", "Doe");

        System.out.println("\nCompare employee1 to employee2: " + employee1.compareTo(employee2));
        System.out.println("Compare employee2 to employee1: " + employee2.compareTo(employee1));

        System.out.println("\nEmployee is instance of comparable: " + (employee1 instanceof Comparable));

        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);

        Collections.sort(list);
        System.out.println("\nAfter Sort: ");
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}
