package com.muhammedtopgul.javamasterclass.collections.set;

import com.muhammedtopgul.javamasterclass.collections.domain.Employee;

import java.util.HashSet;
import java.util.Set;

/**
 * @author muhammed-topgul
 * @created at 14.12.2021 22:43
 */

public class SetWithDuplicatedObjects {

    public static void main(String[] args) {
        Set<Employee> set = new HashSet<>();

        Employee employee1 = new Employee(1, "Muhammed", "Topgul");
        System.out.println(set.add(employee1));

        Employee employee2 = new Employee(2, "Jack", "Doe");
        System.out.println(set.add(employee2));

        Employee employee3 = new Employee(3, "Jim", "Taylor");
        System.out.println(set.add(employee3));

        Employee employee4 = new Employee(1, "Muhammed", "Topgul");
        System.out.println(set.add(employee4));

        set.forEach(System.out::println);
    }
}
