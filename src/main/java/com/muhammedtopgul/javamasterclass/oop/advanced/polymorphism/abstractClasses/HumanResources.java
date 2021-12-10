package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.abstractClasses;

/**
 * @author muhammed-topgul 
 * @since 25.11.2021 10:08
 */

public class HumanResources {

    public Employee getAnEmployee() {
        Employee employee;
        int i = (int) (Math.random() * 4) + 1;

        if (i == 1) {
            employee = new Secretary();
        } else if (i == 2) {
            employee = new Engineer();
        } else if (i == 3) {
            employee = new Manager();
        } else if (i == 4) {
            employee = new Director();
        } else {
            throw new RuntimeException("No such object exception");
        }

        return employee;
    }
}
