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

        List<EmployeeWithoutComparable> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);


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
    }
}
