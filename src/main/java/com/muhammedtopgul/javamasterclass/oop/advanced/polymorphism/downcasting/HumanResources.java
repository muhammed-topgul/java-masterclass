package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.downcasting;

/**
 * @author muhammed-topgul 
 * @created at 25.11.2021 10:08
 */

public class HumanResources {

    public Employee getAnEmployee() {
        Employee employee;
        int i = (int) (Math.random() * 3) + 1;

        if (i == 1) {
            employee = new Employee(1, "Jack", 2, "Cleaning");
        } else if (i == 2) {
            employee = new Manager(2,"Donnie",4, "Accounting","Finance");
        } else if (i == 3) {
            employee = new Director(3, "Angelica", 1,"R&D", "Business");
        } else {
            throw new RuntimeException("No such object exception");
        }

        return employee;
    }
}
