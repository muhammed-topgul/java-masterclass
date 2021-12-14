package com.muhammedtopgul.javamasterclass.collections.interfaces;

import com.muhammedtopgul.javamasterclass.collections.domain.EmployeeWithoutComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author muhammed-topgul
 * @since 14.12.2021 16:53
 */

public class ComparatorExample {

    public static void main(String[] args) {
        EmployeeWithoutComparable employee1 = new EmployeeWithoutComparable(1, "Muhammed", "Topgul");
        EmployeeWithoutComparable employee2 = new EmployeeWithoutComparable(2, "John", "Windy");
        EmployeeWithoutComparable employee3 = new EmployeeWithoutComparable(3, "Allan", "Patrick");

        List<EmployeeWithoutComparable> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        Comparator<EmployeeWithoutComparable> compareByFirstName = (var1, var2) -> var1.getFirstName().compareTo(var2.getFirstName());
        Comparator<EmployeeWithoutComparable> compareByLastName = Comparator.comparing(EmployeeWithoutComparable::getLastName);
        Comparator<EmployeeWithoutComparable> compareByNo = (var1, var2) -> {
            if (var1.getNo() > var2.getNo())
                return 1;
            else if (var1.getNo() < var2.getNo())
                return -1;
            else
                return 0;
        };

        Collections.sort(list, compareByFirstName);
        System.out.println("\nAfter Comparing First Name: ");
        for (EmployeeWithoutComparable employee : list) {
            System.out.println(employee);
        }

        Collections.sort(list, compareByNo);
        System.out.println("\nAfter Comparing By No: ");
        for (EmployeeWithoutComparable employee : list) {
            System.out.println(employee);
        }

        Collections.sort(list, compareByLastName);
        System.out.println("\nAfter Comparing Last Name: ");
        for (EmployeeWithoutComparable employee : list) {
            System.out.println(employee);
        }

        Collections.sort(list, compareByLastName.reversed());
        System.out.println("\nAfter Comparing Reversed Last Name: ");
        for (EmployeeWithoutComparable employee : list) {
            System.out.println(employee);
        }
    }
}
