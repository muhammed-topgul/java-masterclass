package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.upcasting;

import java.rmi.NoSuchObjectException;

/**
 * @author muhammed-topgul created at 25/11/2021 10:08
 */

public class HumanResources {

    public static void main(String[] args) {
        int i = (int) (Math.random() * 3) + 1;
        System.out.println(i);
    }

    public Employee getAnEmployee() {
        Employee employee = null;
        int i = (int) (Math.random() * 3) + 1;

        if (i == 1) {
            employee = new Employee();
        } else if (i == 2) {
            employee = new Manager();
        } else if (i == 3) {
            employee = new Director();
        } else {
            throw new RuntimeException("No such object exception");
        }

        return employee;
    }
}
