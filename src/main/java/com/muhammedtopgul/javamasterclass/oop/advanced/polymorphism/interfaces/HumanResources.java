package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces;

/**
 * @author muhammed-topgul created at 28/11/2021 18:10
 */

public class HumanResources {

    public Worker getAnWorker() {
        Worker worker;
        int i = (int) (Math.random() * 4);
        int no = (int) (Math.random() * 1000) + 1;

        if (i == 0) {
            worker = new Employee(no, "Abate" + no, 2, "Cleaning");
        } else if (i == 1) {
            worker = new Secretary(no, "Bill" + no, 1, "Human Resources");
        } else if (i == 2) {
            worker = new Engineer(no, "Clay" + no, 5, "Software", "Cinema Reservation Application");
        } else if (i == 3) {
            worker = new Manager(no, "David" + no, 4, "Banking and Finance", "Accounting");
        } else if (i == 4) {
            worker = new Director(no, "Edward" + no, 6, "R&D", "Software");
        } else if (i == 5) {
            worker = new Boss(no, "Finn" + no);
        } else {
            throw new RuntimeException("No such object exception");
        }

        return worker;
    }
}
